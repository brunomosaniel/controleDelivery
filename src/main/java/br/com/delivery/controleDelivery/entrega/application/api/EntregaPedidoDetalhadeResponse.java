package br.com.delivery.controleDelivery.entrega.application.api;

import java.util.UUID;

import br.com.delivery.controleDelivery.entrega.domain.Entrega;
import lombok.Value;

@Value
public class EntregaPedidoDetalhadeResponse {
	private UUID idEntrega;
	private UUID idPedido;
	private String nomeCliente;
	private String pontoRefencia;
	private String enderecoEntrega;
	private String numeroCasa;

	public EntregaPedidoDetalhadeResponse(Entrega entrega) {
		this.idEntrega = entrega.getIdEntrega();
		this.idPedido = entrega.getIdPedido();
		this.nomeCliente = entrega.getNomeCliente();
		this.pontoRefencia = entrega.getPontoRefencia();
		this.enderecoEntrega = entrega.getEnderecoEntrega();
		this.numeroCasa = entrega.getNumeroCasa();
	}
	
	
}
