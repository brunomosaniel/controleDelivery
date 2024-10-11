package br.com.delivery.controleDelivery.pedido.application.service;

import br.com.delivery.controleDelivery.pedido.domain.Pedido;

public interface PedidoRepository {
	Pedido salvaPedido(Pedido pedido);

}
