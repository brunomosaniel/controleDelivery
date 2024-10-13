package br.com.delivery.controleDelivery.pedido.application.api;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.delivery.controleDelivery.pedido.domain.Pedido;
import lombok.Value;

@Value
public class PedidoClienteListResponse {
	private UUID idPedido;
	private UUID idCliente;
	private String quantidade;
	private String descricao;
	private String metodoPagamento;
	
	
	public static List<PedidoClienteListResponse> converte(List<Pedido> pedidosDoCliente) {
		return pedidosDoCliente.stream()
				.map(PedidoClienteListResponse::new)
				.collect(Collectors.toList());
	}

	public PedidoClienteListResponse(Pedido pedido) {
		this.idPedido = pedido.getIdPedido();
		this.idCliente = pedido.getIdCliente();
		this.quantidade = pedido.getQuantidade();
		this.descricao = pedido.getDescricao();
		this.metodoPagamento = pedido.getMetodoPagamento();
	}

}
