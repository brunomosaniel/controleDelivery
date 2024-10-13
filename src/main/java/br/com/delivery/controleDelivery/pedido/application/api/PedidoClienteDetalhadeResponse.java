package br.com.delivery.controleDelivery.pedido.application.api;

import java.util.UUID;

import lombok.Value;

@Value
public class PedidoClienteDetalhadeResponse {
	private UUID idPedido;
	private UUID idCliente;
	private String quantidade;
	private String descricao;
	private String metodoPagamento;

}
