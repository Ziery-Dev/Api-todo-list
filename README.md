# TodoList API

API REST para gerenciamento de uma lista de tarefas (*todo list*), construída com Spring Boot e banco de dados MySQL. Esta API permite a criação, leitura, atualização e exclusão de tarefas, além de consultas específicas com base nos atributos das tarefas.

## Estrutura da Entidade Todo
A entidade `Todo` contém os seguintes atributos:

- **nome** (String): Nome da tarefa
- **descrição** (String): Descrição da tarefa
- **realizado** (boolean): Status indicando se a tarefa foi concluída
- **prioridade** (int): Nível de prioridade da tarefa (1 para baixa, 2 para média, etc.)

## Tecnologias Utilizadas
- **Spring Boot** - Framework para criação de APIs REST
- **MySQL** - Banco de dados relacional
- **Spring Data JPA** - Mapeamento ORM
- **Springdoc OpenAPI** - Documentação da API com Swagger UI
- **JUnit** - Testes unitários e de integração

## Pré-requisitos

1. **Java 17** ou superior
2. **MySQL** configurado
3. **Maven** para gerenciar dependências


