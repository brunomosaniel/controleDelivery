package br.com.delivery.controleDelivery.pedido.application.service;

import java.util.List;
import java.util.UUID;

import br.com.delivery.controleDelivery.pedido.domain.Pedido;

public interface PedidoRepository {
	Pedido salvaPedido(Pedido pedido);
	List<Pedido> buscaPedidosDoClienteComID(UUID idCliente);
	Pedido buscaPedidoPeloId(UUID idPedido);
	void deletaPedido(Pedido pedido);
	void salva(Pedido pedido);

}
