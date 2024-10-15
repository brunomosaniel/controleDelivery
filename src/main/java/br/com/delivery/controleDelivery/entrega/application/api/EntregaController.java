package br.com.delivery.controleDelivery.entrega.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.delivery.controleDelivery.entrega.application.service.EntregaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
 
@RestController
@Log4j2
@RequiredArgsConstructor
public class EntregaController implements EntregaAPI {
	private final EntregaService entregaService;

	@Override
	public EntregaResponse postEntrega(UUID idPedido, @Valid EntregaRequest entregaRequest) {
		log.info("[Inicia] EntregaController - postEntrega");
		log.info("[idPedido] {}", idPedido);
		EntregaResponse entrega = entregaService.criaEntrega(idPedido, entregaRequest);
		log.info("[Finaliza] EntregaController - postEntrega");
		return entrega;
	}

	@Override
	public List<EntregaPedidoListResponse> getEntregaDoPedidoComId(UUID idPedido) {
		log.info("[Inicia] EntregaController - getEntregaDoPedidoComId");
		log.info("[idPedido] {}", idPedido);
		List<EntregaPedidoListResponse> entregasDoPedido = entregaService.buscaEntregasDoPedidoComID(idPedido);
		log.info("[Finaliza] EntregaController - getEntregaDoPedidoComId");
		return entregasDoPedido;
	}

	@Override
	public EntregaPedidoDetalhadeResponse getEntregaDoPedidoComId(UUID idPedido, UUID idEntrega) {
		log.info("[Inicia] EntregaController - getEntregaDoPedidoComId");
		log.info("[idPedido] - [idEntrega] {}", idPedido, idEntrega);
		EntregaPedidoDetalhadeResponse entrega = entregaService.buscaEntregasDoPedidoComID(idPedido, idEntrega);
		log.info("[Finaliza] EntregaController - getEntregaDoPedidoComId");
		return entrega;
	}

	@Override
	public void deletaEntregaDoPedidoComId(UUID idPedido, UUID idEntrega) {
		log.info("[Inicia] EntregaController - deletaEntregaDoPedidoComId");
		log.info("[idPedido] - [idEntrega] {}", idPedido, idEntrega);
		entregaService.deletaEntregaDoPedidoComId(idPedido, idEntrega);
		log.info("[Finaliza] EntregaController - deletaEntregaDoPedidoComId");
		
	}

}
