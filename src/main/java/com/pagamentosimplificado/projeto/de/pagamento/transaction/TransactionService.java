package com.pagamentosimplificado.projeto.de.pagamento.transaction;

import com.pagamentosimplificado.projeto.de.pagamento.wallet.WalletRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;
    private final WalletRepository walletRepository;

    public TransactionService(TransactionRepository transactionRepository, WalletRepository walletRepository){
        this.transactionRepository = transactionRepository;
        this.walletRepository = walletRepository;
    }

    public Transaction createTransaction(Transaction transaction){
        var newTransaction = transactionRepository.save(transaction);
        var wallet = walletRepository.findById(transaction.payer()).get();
        walletRepository.save(wallet.debit(transaction.value()));

        return newTransaction;
    }
}
