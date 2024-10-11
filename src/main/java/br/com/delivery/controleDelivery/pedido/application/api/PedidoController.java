package br.com.delivery.controleDelivery.pedido.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class PedidoController implements PedidoApi {

	@Override
	public PedidoResponse postPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		log.info("[Inicia]  PedidoController -  postPedido");
		log.info("[idCliente] {}", idCliente);
		log.info("[Finaliza]  PedidoController -  postPedido");
		return null;
	}

}
