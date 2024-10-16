# Controle Delivery
Este projeto foi desenvolvido com o objetivo de gerenciar e controlar as operações de um serviço de delivery para restaurante.

## Índice

- [Tecnologias](#tecnologias)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Uso](#uso)

  ## Tecnologias

Este projeto foi desenvolvido utilizando as seguintes tecnologias:

- Java 17
- Spring Boot
- Spring Data JPA
- Banco de dados ( H2)
- Maven
- outros (ex: Swagger, Lombok, etc.)
## Pré-requisitos

Antes de começar, verifique se você tem os seguintes softwares instalados:

- JDK 17 ou superior
- Maven 
- Banco de Dados configurado

## Instalação

Siga os passos abaixo para configurar o ambiente de desenvolvimento:

1. Clone o repositório:
   ```bash
   git clone https://github.com/brunomosaniel/controleDelivery.git
   cd controleDelivey
2. Configure o banco de dados em application.yml.
3. Compile o projeto: mvn clean install
4. Execute a aplicação: mvn spring-boot:run

## Uso
  API Cliente
 criar um novo cliente (POST)
 curl -X POST http:localhost:8080/controledelivery/api/v1/cliente
 
 lista todos os Clientes (GET)
 curl -X GET http:localhost:8080/controledelivery/api/v1/cliente/c0a76784-a582-4ca4-8b53-66a5ea5d71be

 busca por usuário (GET)
curl -X GET http:localhost:8080/controledelivery/api/v1/cliente/c0a76784-a582-4ca4-8b53-66a5ea5d71be

 deleta o cliente
 curl -X DEL http:localhost:8080/controledelivery/api/v1/cliente/55fa3802-b334-434f-9399-98f1aeddf8c6

 altera o Cliente
curl -X DEL http:localhost:8080/controledelivery/api/v1/cliente/c0a76784-a582-4ca4-8b53-66a5ea5d71be
 
 
