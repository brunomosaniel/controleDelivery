package br.com.delivery.controleDelivery.entrega.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.delivery.controleDelivery.pedido.application.api.PedidoClienteDetalhadeResponse;
import br.com.delivery.controleDelivery.pedido.application.api.PedidoClienteListResponse;
import br.com.delivery.controleDelivery.pedido.application.api.PedidoRequest;
import br.com.delivery.controleDelivery.pedido.application.api.PedidoResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/pedido/{idPedido}/entrega")
public interface EntregaAPI {
	@PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    EntregaResponse postEntrega(@PathVariable UUID idPedido,
                              @Valid @RequestBody EntregaRequest entregaRequest);
	
	@GetMapping
    @ResponseStatus(code = HttpStatus.OK)
     List<EntregaPedidoListResponse> getEntregaDoPedidoComId(@PathVariable UUID idPedido);

    @GetMapping(value = "/{idEntrega}")
    @ResponseStatus(code = HttpStatus.OK)
    EntregaPedidoDetalhadeResponse getEntregaDoPedidoComId(@PathVariable UUID idPedido, @PathVariable UUID idEntrega);
    

    @DeleteMapping(value = "/{idEntrega}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaEntregaDoPedidoComId(@PathVariable UUID idPedido, @PathVariable UUID idEntrega);

    @PatchMapping(value = "/{idEntrega}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void patchEntrega(@PathVariable UUID idPedido,  @PathVariable UUID idEntrega,
                              @Valid @RequestBody EntregaAlterecaoRequest entregaAlteracaoRequest);
}
