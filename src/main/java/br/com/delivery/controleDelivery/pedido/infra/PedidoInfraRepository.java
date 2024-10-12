package br.com.delivery.controleDelivery.pedido.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.delivery.controleDelivery.pedido.application.service.PedidoRepository;
import br.com.delivery.controleDelivery.pedido.domain.Pedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PedidoInfraRepository implements PedidoRepository {
	private final PedidoSpringDataJPARepository pedidoSpringDataJPARepository;
	@Override
	public Pedido salvaPedido(Pedido pedido) {
		log.info("[start] PedidoInfraRepository - salvaPedido");
		pedidoSpringDataJPARepository.save(pedido);
		log.info("[finish] PedidoInfraRepository - salvaPedido");
		return pedido;
	}
	@Override
	public List<Pedido> buscaPedidosDoClienteComID(UUID idCliente) {
		log.info("[start] PedidoInfraRepository - buscaPedidosDoClienteComID");	
		
		log.info("[finish] PedidoInfraRepository - buscaPedidosDoClienteComID");		
		return null;
	}
}
