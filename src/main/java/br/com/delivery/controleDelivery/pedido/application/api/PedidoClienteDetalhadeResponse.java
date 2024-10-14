package br.com.delivery.controleDelivery.pedido.application.api;

import java.util.UUID;

import br.com.delivery.controleDelivery.pedido.domain.Pedido;
import lombok.Value;

@Value
public class PedidoClienteDetalhadeResponse {
	private UUID idPedido;
	private UUID idCliente;
	private String quantidade;
	private String descricao;
	private String metodoPagamento;
	
	public PedidoClienteDetalhadeResponse(Pedido pedido) {
		this.idPedido = pedido.getIdPedido();
		this.idCliente = pedido.getIdCliente();
		this.quantidade = pedido.getQuantidade();
		this.descricao = pedido.getDescricao();
		this.metodoPagamento = pedido.getMetodoPagamento();
	}
	
}
