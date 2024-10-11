package br.com.delivery.controleDelivery.pedido.application.api;

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
}
