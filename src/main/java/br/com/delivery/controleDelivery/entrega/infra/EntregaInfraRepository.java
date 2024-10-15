package br.com.delivery.controleDelivery.entrega.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.delivery.controleDelivery.cliente.handler.APIException;
import br.com.delivery.controleDelivery.entrega.application.service.EntregaRepository;
import br.com.delivery.controleDelivery.entrega.domain.Entrega;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class EntregaInfraRepository implements EntregaRepository {
	private final EntregaSpringDataJPARepository entregaSpringDataJPARepository;

	@Override
	public Entrega salvaEntrega(Entrega entrega) {
		log.info("[start] EntregaInfraRepository - salvaEntrega");
		entregaSpringDataJPARepository.save(entrega);
		log.info("[finish] EntregaInfraRepository - salvaEntrega");
		return entrega;
	}

	@Override
	public List<Entrega> buscaEntregasDoPedidoComID(UUID idPedido) {
		log.info("[start] EntregaInfraRepository - buscaEntregasDoPedidoComID");
		var entregas = entregaSpringDataJPARepository.findByIdPedido(idPedido);
		log.info("[finish] EntregaInfraRepository - buscaEntregasDoPedidoComID");
		return entregas;
	}

	@Override
	public Entrega buscaEntregaPeloId(UUID idEntrega) {
		log.info("[start] EntregaInfraRepository - buscaEntregaPeloId");
		var pedido = entregaSpringDataJPARepository.findById(idEntrega)
		.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Entrega não encontrado para idEntrega" + idEntrega));
		log.info("[finish] EntregaInfraRepository - buscaEntregaPeloId");
		return pedido;
	}

	@Override
	public void deletaEntrega(Entrega entrega) {
		log.info("[start] EntregaInfraRepository - deletaEntrega");
		entregaSpringDataJPARepository.delete(entrega);
		log.info("[finish] EntregaInfraRepository - deletaEntrega");
		
	}

}
