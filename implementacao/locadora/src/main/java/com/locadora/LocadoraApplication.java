package com.locadora;

import com.locadora.model.Automovel;
import com.locadora.repository.AutomovelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LocadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocadoraApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(AutomovelRepository automovelRepository) {
		return (args) -> {
			Automovel automovel = Automovel.builder()
					.matricula("1234")
					.ano("2021")
					.marca("Chevrolet")
					.modelo("Onix")
					.placa("ABC-1234")
					.proprietario("João")
					.disponivel(true)
					.build();
			automovelRepository.save(automovel);
		};
	}
}
