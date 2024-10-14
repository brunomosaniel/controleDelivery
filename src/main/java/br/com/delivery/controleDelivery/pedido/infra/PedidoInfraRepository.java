package br.com.delivery.controleDelivery.pedido.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.delivery.controleDelivery.cliente.handler.APIException;
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
		var pedidos = pedidoSpringDataJPARepository.findByIdCliente(idCliente);
		log.info("[finish] PedidoInfraRepository - buscaPedidosDoClienteComID");		
		return pedidos;
	}
	@Override
	public Pedido buscaPedidoPeloId(UUID idPedido) {
		log.info("[start] PedidoInfraRepository - buscaPedidoPeloId");	
		var pedido = pedidoSpringDataJPARepository.findById(idPedido)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Pedido não encontrado para idPedido = " + idPedido));
		log.info("[finish] PedidoInfraRepository - buscaPedidoPeloId");	
		return pedido;
	}
	@Override
	public void deletaPedido(Pedido pedido) {
		log.info("[start] PedidoInfraRepository - deletaPedido");	
		pedidoSpringDataJPARepository.delete(pedido);
		log.info("[finish] PedidoInfraRepository - deletaPedido");	
		
		
	}
}
