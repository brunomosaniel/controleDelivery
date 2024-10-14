package br.com.delivery.controleDelivery.entrega.application.service;

import java.util.List;
import java.util.UUID;

import br.com.delivery.controleDelivery.entrega.domain.Entrega;

public interface EntregaRepository {
	Entrega salvaEntrega(Entrega entrega);
	List<Entrega> buscaEntregasDoPedidoComID(UUID idPedido);

}
