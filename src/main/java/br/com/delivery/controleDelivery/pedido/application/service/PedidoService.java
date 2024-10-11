package br.com.delivery.controleDelivery.pedido.application.service;

import java.util.UUID;

import br.com.delivery.controleDelivery.pedido.application.api.PedidoRequest;
import br.com.delivery.controleDelivery.pedido.application.api.PedidoResponse;
import jakarta.validation.Valid;

public interface PedidoService {
	PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest);

}
