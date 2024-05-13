package com.pagamentosimplificado.projeto.de.pagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;

@SpringBootApplication
@EnableJdbcAuditing
public class ProjetoDePagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDePagamentoApplication.class, args);
	}

}
