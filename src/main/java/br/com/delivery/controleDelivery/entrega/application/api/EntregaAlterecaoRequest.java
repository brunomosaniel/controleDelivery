package br.com.delivery.controleDelivery.entrega.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class EntregaAlterecaoRequest {
	private String pontoReferencia;
	@NotBlank
	private String enderecoEntrega;
	@NotBlank
	private String numeroCasa;

}
