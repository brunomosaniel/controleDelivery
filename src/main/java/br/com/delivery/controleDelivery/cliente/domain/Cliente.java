package br.com.delivery.controleDelivery.cliente.domain;

import br.com.delivery.controleDelivery.cliente.application.api.ClienteAlteracaoRequest;
import br.com.delivery.controleDelivery.cliente.application.api.ClienteRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)
    private UUID idCliente;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String endereco;
    @NotBlank
    private String celular;
    @NotBlank
    @CPF
    private String cpf;
    @NotBlank
    @Email
    private String email;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime getDataHoraDaUltimaAlteracao;


    public Cliente(ClienteRequest clienteRequest) {
        this.nomeCompleto = clienteRequest.getNomeCompleto();
        this.endereco = clienteRequest.getEndereco();
        this.celular = clienteRequest.getCelular();
        this.cpf = clienteRequest.getCpf();
        this.email = clienteRequest.getEmail();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }



    public void altera(ClienteAlteracaoRequest clienteAlteracaoRequest) {
        this.nomeCompleto =  clienteAlteracaoRequest.getNomeCompleto();
        this.endereco = clienteAlteracaoRequest.getEndereco();
        this.celular = clienteAlteracaoRequest.getCelular();
        this.cpf = clienteAlteracaoRequest.getCelular();
        this.getDataHoraDaUltimaAlteracao = LocalDateTime.now();

    }
}
