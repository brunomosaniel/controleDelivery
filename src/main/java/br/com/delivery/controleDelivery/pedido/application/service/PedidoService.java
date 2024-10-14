package br.com.delivery.controleDelivery.pedido.application.service;

import java.util.List;
import java.util.UUID;

import br.com.delivery.controleDelivery.pedido.application.api.PedidoAlteracaoRequest;
import br.com.delivery.controleDelivery.pedido.application.api.PedidoClienteDetalhadeResponse;
import br.com.delivery.controleDelivery.pedido.application.api.PedidoClienteListResponse;
import br.com.delivery.controleDelivery.pedido.application.api.PedidoRequest;
import br.com.delivery.controleDelivery.pedido.application.api.PedidoResponse;
import jakarta.validation.Valid;

public interface PedidoService {
	PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest);
	List<PedidoClienteListResponse> buscaPedidosDoClienteComID(UUID idCliente);
	PedidoClienteDetalhadeResponse buscaPedidoDoClienteComID(UUID idCliente, UUID idPedido);
	void deletaPedidoDoClienteComID(UUID idCliente, UUID idPedido);
	void alteraPedidoDoClienteComID(UUID idCliente, UUID idPedido,
			PedidoAlteracaoRequest pedidoAlteracaoRequest);
}
