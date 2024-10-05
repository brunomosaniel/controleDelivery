package br.com.delivery.controleDelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ControleDeliveryApplication {

	public String getHomeTeste() {
		return "Controle Delivery - API HOME";
	}

	public static void main(String[] args) {
		SpringApplication.run(ControleDeliveryApplication.class, args);
	}

}
