package br.com.delivery.controleDelivery.entrega.application.service;

import java.util.List;
import java.util.UUID;

import br.com.delivery.controleDelivery.entrega.application.api.EntregaAlterecaoRequest;
import br.com.delivery.controleDelivery.entrega.application.api.EntregaPedidoDetalhadeResponse;
import br.com.delivery.controleDelivery.entrega.application.api.EntregaPedidoListResponse;
import br.com.delivery.controleDelivery.entrega.application.api.EntregaRequest;
import br.com.delivery.controleDelivery.entrega.application.api.EntregaResponse;
import jakarta.validation.Valid;

public interface EntregaService {
	EntregaResponse criaEntrega(UUID idPedido, @Valid EntregaRequest entregaRequest);
	List<EntregaPedidoListResponse> buscaEntregasDoPedidoComID(UUID idPedido);
	EntregaPedidoDetalhadeResponse buscaEntregasDoPedidoComID(UUID idPedido, UUID idEntrega);
	void deletaEntregaDoPedidoComId(UUID idPedido, UUID idEntrega);
	void alteraEntregaDoPedidoComId(UUID idPedido, UUID idEntrega,
			@Valid EntregaAlterecaoRequest entregaAlteracaoRequest);
}
