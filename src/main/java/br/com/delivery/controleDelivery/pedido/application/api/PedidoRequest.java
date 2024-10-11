package br.com.delivery.controleDelivery.pedido.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class PedidoRequest {
	@NotBlank
	private String quantidade;
    @NotBlank
    private String descricao;
    @NotBlank
    private String metodoPagamento;
}
