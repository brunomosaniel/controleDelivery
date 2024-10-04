package br.com.delivery.controleDelivery.cliente.application.api;

import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Value;

import java.util.UUID;


@Value
@Builder
public class ClienteResponse {
    private UUID idCliente;
}
