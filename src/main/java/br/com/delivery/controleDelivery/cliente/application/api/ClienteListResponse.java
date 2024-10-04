package br.com.delivery.controleDelivery.cliente.application.api;

import br.com.delivery.controleDelivery.cliente.domain.Cliente;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String endereco;
    private String celular;
    private String cpf;
    private String email;

    public static List<ClienteListResponse> converte(List<Cliente> clientes) {
        return clientes.stream()
                .map(ClienteListResponse::new)
                .collect(Collectors.toList());
    }

    public ClienteListResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.endereco = cliente.getEndereco();
        this.celular = cliente.getCelular();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
    }
}
