package br.com.delivery.controleDelivery.cliente.application.api;

import br.com.delivery.controleDelivery.cliente.domain.Cliente;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class ClienteDetalhadoResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String endereco;
    private String celular;
    private String cpf;
    private String email;
    private LocalDateTime dataHoraDoCadastro;


    public ClienteDetalhadoResponse(Cliente cliente) {
        this.idCliente =  cliente.getIdCliente();
        this.nomeCompleto =  cliente.getNomeCompleto();
        this.endereco =  cliente.getEndereco();
        this.celular =  cliente.getCelular();
        this.cpf =  cliente.getCpf();
        this.email =  cliente.getEmail();
        this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();

    }
}
