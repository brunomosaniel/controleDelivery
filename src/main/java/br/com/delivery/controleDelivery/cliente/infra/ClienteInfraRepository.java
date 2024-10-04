package br.com.delivery.controleDelivery.cliente.infra;

import br.com.delivery.controleDelivery.cliente.application.repository.ClienteRepository;
import br.com.delivery.controleDelivery.cliente.domain.Cliente;
import br.com.delivery.controleDelivery.cliente.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
    private ClienteSpringDataJPARepository clienteSpringDataJPARepository;

    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[start] ClienteInfraRepository - salva ");
        clienteSpringDataJPARepository.save(cliente);
        log.info("[finish] ClienteInfraRepository - salva ");
        return cliente;
    }

    @Override
    public List<Cliente> buscaTodosClientes() {
        log.info("[start] ClienteInfraRepository - buscaTodosClientes ");
       List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
        log.info("[finish] ClienteInfraRepository - buscaTodosClientes ");
        return todosClientes;
    }

    @Override
    public Cliente buscaClienteAtravesId(UUID idCliente) {
        log.info("[start] ClienteInfraRepository - buscaClienteAtravesId ");
        Cliente cliente = (Cliente) clienteSpringDataJPARepository.findByIdCliente(idCliente)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
        log.info("[finish] ClienteInfraRepository - buscaClienteAtravesId ");
        return cliente;
    }

    @Override
    public void deletaCliente(Cliente cliente) {
        log.info("[start] ClienteInfraRepository - deletaCliente");
        clienteSpringDataJPARepository.delete(cliente);
        log.info("[finish] ClienteInfraRepository - deletaCliente");
    }
}
