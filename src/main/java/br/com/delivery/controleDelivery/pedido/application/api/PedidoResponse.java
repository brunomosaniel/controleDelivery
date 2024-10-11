package br.com.delivery.controleDelivery.pedido.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PedidoResponse {
	  private UUID idPedido;
}
