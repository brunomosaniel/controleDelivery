package br.com.delivery.controleDelivery.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.delivery.controleDelivery.cliente.application.api.ClienteAlteracaoRequest;
import br.com.delivery.controleDelivery.cliente.application.api.ClienteDetalhadoResponse;
import br.com.delivery.controleDelivery.cliente.application.api.ClienteListResponse;
import br.com.delivery.controleDelivery.cliente.application.api.ClienteRequest;
import br.com.delivery.controleDelivery.cliente.application.api.ClienteResponse;
import jakarta.validation.Valid;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaTodosClientes();
    ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
    void deletaClienteAtravesId(UUID idCliente);
	void patchAlteraCliente(UUID idCliente, @Valid ClienteAlteracaoRequest clienteAlteracaoRequest);
   }
