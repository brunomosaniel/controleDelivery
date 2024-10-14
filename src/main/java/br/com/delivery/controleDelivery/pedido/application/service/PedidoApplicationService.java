package br.com.delivery.controleDelivery.pedido.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.delivery.controleDelivery.cliente.application.service.ClienteService;
import br.com.delivery.controleDelivery.pedido.application.api.PedidoClienteDetalhadeResponse;
import br.com.delivery.controleDelivery.pedido.application.api.PedidoClienteListResponse;
import br.com.delivery.controleDelivery.pedido.application.api.PedidoRequest;
import br.com.delivery.controleDelivery.pedido.application.api.PedidoResponse;
import br.com.delivery.controleDelivery.pedido.domain.Pedido;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PedidoApplicationService implements PedidoService {
	private final ClienteService clienteService;
	private final PedidoRepository pedidoRepository;
	@Override
	public PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		log.info("[start] PedidoApplicationService - criaPedido");
		clienteService.buscaClienteAtravesId(idCliente);
		Pedido pedido = pedidoRepository.salvaPedido(new Pedido(idCliente, pedidoRequest));
		log.info("[finish] PedidoApplicationService - criaPedido");
		return new PedidoResponse(pedido.getIdPedido());
	}
	@Override
	public List<PedidoClienteListResponse> buscaPedidosDoClienteComID(UUID idCliente) {
		log.info("[start] PedidoApplicationService - buscaPedidosDoClienteComID");
		clienteService.buscaClienteAtravesId(idCliente);
		List<Pedido> pedidosDoCliente = pedidoRepository.buscaPedidosDoClienteComID(idCliente);
		log.info("[finish] PedidoApplicationService - buscaPedidosDoClienteComID");
		return PedidoClienteListResponse.converte(pedidosDoCliente);
	}
	@Override
	public PedidoClienteDetalhadeResponse buscaPedidoDoClienteComID(UUID idCliente, UUID idPedido) {
		log.info("[start] PedidoApplicationService - buscaPedidoDoClienteComID");
		clienteService.buscaClienteAtravesId(idCliente);
		Pedido pedido = pedidoRepository.buscaPedidoPeloId(idPedido);
		log.info("[finish] PedidoApplicationService - buscaPedidoDoClienteComID");
		return new PedidoClienteDetalhadeResponse(pedido);
	}
	@Override
	public void deletaPedidoDoClienteComID(UUID idCliente, UUID idPedido) {
		// TODO Auto-generated method stub
		log.info("[start] PedidoApplicationService - deletaPedidoDoClienteComID");
		log.info("[finish] PedidoApplicationService - deletaPedidoDoClienteComID");
		
	}

}
