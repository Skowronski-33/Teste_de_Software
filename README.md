<<<<<<< HEAD
# CRUD de Produtos com Testes (Spring Boot)

Um projeto acadêmico completo que implementa uma aplicação de CRUD (Create, Read, Update, Delete) em Java com Spring Boot, com foco na demonstração de uma suíte de testes robusta em três níveis: Unidade, Integração e Sistema.

-----

## 📖 Descrição do Projeto

Este projeto foi desenvolvido como um requisito acadêmico durante a disciplina de Teste de Software para demonstrar a aplicação prática de testes de software em uma aplicação web moderna. A aplicação permite o gerenciamento de um cadastro de produtos, validando cada camada da arquitetura com uma estratégia de teste específica.

-----

## ✨ Funcionalidades

  - [x] **Cadastro de Produtos:** Criação de novos produtos com nome, preço e quantidade.
  - [x] **Listagem de Produtos:** Visualização de todos os produtos cadastrados em uma tabela.
  - [x] **Teste de Unidade:** Validação da camada de serviço (`ProdutoService`) de forma isolada usando Mockito.
  - [x] **Teste de Integração:** Validação do fluxo completo da API, desde a requisição HTTP até a persistência no banco de dados.
  - [x] **Teste de Sistema (E2E):** Simulação da interação de um usuário real com a interface web usando Selenium WebDriver para automatizar o navegador.

-----

## 🛠️ Tecnologias Utilizadas

O projeto foi construído utilizando as seguintes tecnologias:

  - **Backend:**
      - Java 17
      - Spring Boot 3
      - Spring Data JPA
      - Hibernate
  - **Frontend:**
      - Thymeleaf
      - HTML5 & CSS3
  - **Banco de Dados:**
      - H2 Database (ambiente de desenvolvimento/teste)
  - **Testes:**
      - JUnit 5
      - Mockito
      - Selenium WebDriver
  - **Build & Gerenciamento:**
      - Apache Maven

-----

## 🚀 Como Começar

Siga as instruções abaixo para obter uma cópia do projeto e executá-lo em sua máquina local.

### Pré-requisitos

Antes de começar, você vai precisar ter as seguintes ferramentas instaladas:

  * [Java Development Kit (JDK) 17 ou superior](https://www.oracle.com/java/technologies/downloads/)
  * [Apache Maven](https://maven.apache.org/download.cgi)

### Instalação

1.  Clone o repositório para sua máquina local:
    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```
2.  Navegue até o diretório do projeto:
    ```bash
    cd produto-api
    ```
3.  Execute a aplicação com o Maven:
    ```bash
    mvn spring-boot:run
    ```
4.  A aplicação estará disponível em `http://localhost:8080/produtos` (ou na porta que você configurou).

-----

## 🧪 Executando os Testes

Para rodar a suíte completa de testes automatizados, utilize o comando:

```bash
mvn test
```

O Maven irá executar todos os testes de unidade, integração e sistema. Uma mensagem `BUILD SUCCESS` indica que todos os testes passaram.

-----

## 🔌 Endpoints da API

A aplicação oferece os seguintes endpoints REST para manipulação de dados:

| Método HTTP | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/api/produtos` | Retorna a lista de todos os produtos. |
| `POST` | `/api/produtos` | Cria um novo produto. |

-----

## ✍️ Autor

Feito por Pedro Henrique Skowronski

=======
# Teste_de_Software
>>>>>>> 60b730f7872ecd4be11b4e779de2c0dc332d51ec
