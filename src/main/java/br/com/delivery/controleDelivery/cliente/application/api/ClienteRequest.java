package br.com.delivery.controleDelivery.cliente.application.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

@Value
public class ClienteRequest {
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

}
