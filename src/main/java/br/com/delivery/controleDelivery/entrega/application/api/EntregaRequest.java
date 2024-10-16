package br.com.delivery.controleDelivery.entrega.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;
@Value
public class EntregaRequest {
	@NotBlank
	private String nomeCliente;
	private String pontoReferencia;
	@NotBlank
	private String enderecoEntrega;
	@NotBlank
	private String numeroCasa;

}
