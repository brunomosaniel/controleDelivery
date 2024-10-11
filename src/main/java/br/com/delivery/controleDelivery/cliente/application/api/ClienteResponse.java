package br.com.delivery.controleDelivery.cliente.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;


@Value
@Builder
public class ClienteResponse {
    private UUID idCliente;
}
