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
Como Criar Cliente, Pedido e Entrega:
```bash
curl -X POST localhost:8080/controledelivery/api/v1/cliente

curl -X POST localhost:8080/controledelivery/api/v1/cliente/7ed44276-a1f0-413d-9ee0-3ac3b12f10a6/pedido

curl -X localhost:8080/controledelivery/api/v1/pedido/d76c0b5f-3066-45cc-a80e-993efdd0ce58/entrega

  
