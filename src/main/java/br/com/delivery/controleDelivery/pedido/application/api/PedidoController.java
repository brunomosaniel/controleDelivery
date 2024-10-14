package br.com.delivery.controleDelivery.pedido.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.delivery.controleDelivery.pedido.application.service.PedidoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PedidoController implements PedidoApi {
	private final PedidoService pedidoService;

	@Override
	public PedidoResponse postPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		log.info("[Inicia]  PedidoController -  postPedido");
		log.info("[idCliente] {}", idCliente);
		PedidoResponse pedido = pedidoService.criaPedido(idCliente, pedidoRequest);
		log.info("[Finaliza]  PedidoController -  postPedido");
		return pedido;
	}
	@Override
	public List<PedidoClienteListResponse> getPedidoDoClienteComId(UUID idCliente) {
		log.info("[start]  PedidoController -  getPedidoDoClienteComId");
		log.info("[idCliente] {}", idCliente);
		List<PedidoClienteListResponse> pedidosDoCliente = pedidoService.buscaPedidosDoClienteComID(idCliente);
		log.info("[finish]  PedidoController -  getPedidoDoClienteComId");
		return pedidosDoCliente;
	}
	@Override
	public PedidoClienteDetalhadeResponse getPedidoDoClienteComId(UUID idCliente, UUID idPedido) {
		log.info("[start]  PedidoController -  getPedidoDoClienteComId");
		log.info("[idCliente] {} - [idPedido] {}", idCliente, idPedido);
		PedidoClienteDetalhadeResponse pedido = pedidoService.buscaPedidoDoClienteComID(idCliente, idPedido);
		log.info("[finish]  PedidoController -  getPedidoDoClienteComId");
		return pedido;
	}
	@Override
	public void deletePedidDoClienteComId(UUID idCliente, UUID idPedido) {
		log.info("[start]  PedidoController -  deletePedidDoClienteComId");
		log.info("[idCliente] {} - [idPedido] {}", idCliente, idPedido);
		pedidoService.deletaPedidoDoClienteComID(idCliente, idPedido);
		log.info("[finish]  PedidoController -  deletePedidDoClienteComId");
		
	}
	@Override
	public void patchPedido(UUID idCliente, UUID idPedido,
			@Valid PedidoAlteracaoRequest pedidoAlteracaoRequest) {
		log.info("[start]  PedidoController -  patchPedido");
		log.info("[idCliente] {} - [idPedido] {}", idCliente, idPedido);
		pedidoService.alteraPedidoDoClienteComID(idCliente, idPedido, pedidoAlteracaoRequest );
		log.info("[finish]  PedidoController -  patchPedido");
	}
}
