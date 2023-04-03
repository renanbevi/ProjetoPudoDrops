package br.com.mandae.Projeto.Feign.Consumir.o.cep.e.informar.o.Drops;

import feign.Contract;
import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
public class ProjetoFeignConsumirOCepEInformarODropsApplication {


	@Bean
	public Contract feignContract()
	{
		return new Contract.Default();
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoFeignConsumirOCepEInformarODropsApplication.class, args);
	}

}
