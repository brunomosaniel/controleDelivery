package br.com.delivery.controleDelivery.entrega.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.delivery.controleDelivery.entrega.application.api.EntregaPedidoDetalhadeResponse;
import br.com.delivery.controleDelivery.entrega.application.api.EntregaPedidoListResponse;
import br.com.delivery.controleDelivery.entrega.application.api.EntregaRequest;
import br.com.delivery.controleDelivery.entrega.application.api.EntregaResponse;
import br.com.delivery.controleDelivery.entrega.domain.Entrega;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class EntregaApplicationService implements EntregaService {
	private final EntregaRepository entregaRepository;

	@Override
	public EntregaResponse criaEntrega(UUID idPedido, @Valid EntregaRequest entregaRequest) {
		log.info("[start] EntregaApplicationService - criaEntrega"); 
		 Entrega entrega = entregaRepository.salvaEntrega(new Entrega(idPedido, entregaRequest));
		 log.info("[finish] EntregaApplicationService - criaEntrega");
		return new EntregaResponse(entrega.getIdEntrega());
	}

	@Override
	public List<EntregaPedidoListResponse> buscaEntregasDoPedidoComID(UUID idPedido) {
		log.info("[start] EntregaApplicationService - buscaEntregasDoPedidoComID"); 
		List<Entrega> entregasDoPedido = entregaRepository.buscaEntregasDoPedidoComID(idPedido);
		log.info("[finish] EntregaApplicationService - buscaEntregasDoPedidoComID"); 
		return EntregaPedidoListResponse.converte(entregasDoPedido);
	}

	@Override
	public EntregaPedidoDetalhadeResponse buscaEntregasDoPedidoComID(UUID idPedido, UUID idEntrega) {
		log.info("[start] EntregaApplicationService - buscaEntregasDoPedidoComID"); 
		Entrega entrega = entregaRepository.buscaEntregaPeloId(idEntrega);
		log.info("[finish] EntregaApplicationService - buscaEntregasDoPedidoComID"); 
		return new EntregaPedidoDetalhadeResponse(entrega);
	}

	@Override
	public void deletaEntregaDoPedidoComId(UUID idPedido, UUID idEntrega) {
		log.info("[start] EntregaApplicationService -  deletaEntregaDoPedidoComId"); 
		Entrega entrega = entregaRepository.buscaEntregaPeloId(idEntrega);
		entregaRepository.deletaEntrega(entrega);
		log.info("[finish] EntregaApplicationService -  deletaEntregaDoPedidoComId"); 
		
	}

}
