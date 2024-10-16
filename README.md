# Controle Delivery
Este projeto foi desenvolvido com o objetivo de gerenciar e controlar as operações de um serviço de delivery para restaurante.

## Índice

- [Tecnologias](#tecnologias)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Uso](#uso)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Contribuição](#contribuição)
- [Licença](#licença)

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
  ### API Cliente
  
 criar um novo cliente (POST)
 curl -X POST http:localhost:8080/controledelivery/api/v1/cliente
 
 lista todos os Clientes (GET)
 curl -X GET http:localhost:8080/controledelivery/api/v1/cliente/c0a76784-a582-4ca4-8b53-66a5ea5d71be

 busca por usuário (GET)
curl -X GET http:localhost:8080/controledelivery/api/v1/cliente/c0a76784-a582-4ca4-8b53-66a5ea5d71be

 deleta o cliente
 curl -X DEL http:localhost:8080/controledelivery/api/v1/cliente/55fa3802-b334-434f-9399-98f1aeddf8c6

 altera o Cliente
curl -X PATCH http:localhost:8080/controledelivery/api/v1/cliente/c0a76784-a582-4ca4-8b53-66a5ea5d71be

### API Pedido
 
 criar um novo Pedido (POST)
 curl -X POST http:localhost:8080/controledelivery/api/v1/cliente/7ed44276-a1f0-413d-9ee0-3ac3b12f10a6/pedido

 lista todos os Pedidos (GET)
 curl -X GET http:localhost:8080/controledelivery/api/v1/cliente/e0085fe7-51bf-4c38-a391-57ba9b96b88b/pedido

 busca por Pedido (GET)
 curl -X GET http:localhost:localhost:8080/controledelivery/api/v1/cliente/e0085fe7-51bf-4c38-a391-57ba9b96b88b/pedido/61d76438-e9e3-4663-ad40-4f80940224f6

  deleta o Pedido
 curl -X DEL http:localhost:8080/controledelivery/api/v1/cliente/244dfd49-cbfd-4a25-abf0-9fa6158ce4ea/pedido/51d12356-f6fc-46c0-bc24-c9bd404a3f76

 altera o Pedido
curl -X PATCH http:localhost:8080/controledelivery/api/v1/cliente/47b284ae-b3a8-42d1-bd24-edb9900aeb2f/pedido/16c5b0ef-e584-484c-8ffb-ba3e7c8464b0

### API Entrega

 criar uma Entrega (POST)
 curl -X POST http:localhost:8080/controledelivery/api/v1/pedido/d76c0b5f-3066-45cc-a80e-993efdd0ce58/entrega

 lista todos os Entregas (GET)
  curl -X GET http:localhost:8080/controledelivery/api/v1/pedido/00f100a9-74ab-44b6-98eb-bdbb3b9cbe79/entrega

 busca por Entrega (GET)
 curl -X GET http:localhost:8080/controledelivery/api/v1/pedido/d76c0b5f-3066-45cc-a80e-993efdd0ce58/entrega/f066c914-69dc-45dc-b253-62ce64d3ea0c

  deleta o Entrega
 curl -X DEL http:localhost:8080/controledelivery/api/v1/pedido/f72d24eb-1d5d-4dbc-b889-0b51980679d9/entrega/62ca6ae9-d0fe-4fab-a75d-3bf300f46fd9

 altera o Entrega
curl -X PATCH http:localhost:8080/controledelivery/api/v1/pedido/d76c0b5f-3066-45cc-a80e-993efdd0ce58/entrega/f066c914-69dc-45dc-b253-62ce64d3ea0c


 ## Estrutura do Projeto
```
src/
├── main/
│   ├── java/
│   │   └── seu/pacote/
│   │       ├── controller/
│   │       ├── service/
│   │       └── repository/
│   └── resources/
│       ├── application.properties
│       └── static/
└── test/

## Contribuição

 Se você quiser contribuir, siga estas etapas:
1. Fork o projeto.
2. Crie uma nova branch (git checkout -b minha-feature).
3. Faça suas alterações e commit (git commit -m 'Adiciona nova feature').
4. Push a branch (git push origin minha-feature).
5. Crie um novo Pull Request.
 
