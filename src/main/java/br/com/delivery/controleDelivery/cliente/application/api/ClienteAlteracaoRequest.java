package br.com.delivery.controleDelivery.cliente.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class ClienteAlteracaoRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String endereco;
	@NotBlank
	private String celular;
	@NotBlank
	private String cpf;
	@NotBlank
	private String email;
}
