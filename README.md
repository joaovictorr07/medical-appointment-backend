# Medical Appointment Registration System - Backend

## Overview

This repository contains the source code for the backend of the medical appointment registration system. Developed in Java 8, it utilizes the Spring framework for building enterprise Java applications. Additionally, the project includes Swagger for API documentation, JUnit for automated testing, and Hibernate for object-relational mapping.

## Technologies Used

- **Java 8:** The primary programming language used in the backend.

- **Spring Framework:** Used for building enterprise Java applications, providing a robust and modular framework.

- **Swagger:** Implemented for API documentation, facilitating understanding and integration with the backend.

- **JUnit:** Testing framework for executing automated tests on the code.

- **Hibernate:** Used for object-relational mapping, simplifying interaction with the database.

## Configuration and Execution

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/joaovictorr07/medical-appointment-backend.git
   cd medical-appointment-backend
   ```

2. **Database Configuration:**
   - Configure database properties in the `application.properties` file.

3. **Run the Application:**
   - Run the Spring Boot application.

## API Endpoints

- **Swagger Documentation:**
   Access the API documentation using Swagger at the following address:
   ```
   http://localhost:8080/swagger-ui.html
   ```

- **Example Endpoints:**
   - Retrieve all appointments: `GET /appointments`
   - Schedule a new appointment: `POST /appointments`
   - Retrieve details of a specific appointment: `GET /appointments/{id}`
   - ...

## Testing

- **JUnit Automated Tests:**
   - Run automated tests using the command:
     ```bash
     mvn test
     ```

## Contributions

If you want to contribute to this project, follow the [contribution guidelines](CONTRIBUTING.md).

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

- Developed with Java 8, Spring, Swagger, JUnit, and Hibernate.
- Thanks to the development communities of the technologies used.

For questions or concerns, contact [joaovictor.fernandespereira@gmail.com](mailto:joaovictor.fernandespereira@gmail.com).

Happy coding!

---

# Sistema de Registro de Consultas Médicas - Backend

## Visão Geral

Este repositório contém o código-fonte para o backend do sistema de registro de consultas médicas. Desenvolvido em Java 8, utiliza o framework Spring para a construção de aplicações Java empresariais. Além disso, o projeto inclui o uso do Swagger para a documentação da API, JUnit para testes automatizados e Hibernate para o mapeamento objeto-relacional.

## Tecnologias Utilizadas

- **Java 8:** A linguagem de programação principal utilizada no backend.

- **Spring Framework:** Utilizado para a construção de aplicações Java empresariais, proporcionando uma estrutura robusta e modular.

- **Swagger:** Implementado para a documentação da API, facilitando a compreensão e integração com o backend.

- **JUnit:** Framework de teste para a execução de testes automatizados no código.

- **Hibernate:** Utilizado para o mapeamento objeto-relacional, simplificando a interação com o banco de dados.

## Configuração e Execução

1. **Clone o Repositório:**
   ```bash
   git clone https://github.com/joaovictorr07/medical-appointment-backend.git
   cd medical-appointment-backend
   ```

2. **Configurações do Banco de Dados:**
   - Configure as propriedades do banco de dados no arquivo `application.properties`.

3. **Executar a Aplicação:**
   - Execute a aplicação Spring Boot.

## Endpoints da API

- **Documentação Swagger:**
   Acesse a documentação da API usando o Swagger pelo seguinte endereço:
   ```
   http://localhost:8080/swagger-ui.html
   ```

- **Exemplo de Endpoints:**
   - Consultar todas as consultas: `GET /consultas`
   - Agendar uma nova consulta: `POST /consultas`
   - Consultar detalhes de uma consulta específica: `GET /consultas/{id}`
   - ...

## Testes

- **JUnit Testes Automatizados:**
   - Execute os testes automatizados usando o comando:
     ```bash
     mvn test
     ```

## Contribuições

Se deseja contribuir para este projeto, siga as [diretrizes de contribuição](CONTRIBUTING.md).

## Licença

Este projeto é licenciado sob a [Licença MIT](LICENSE).

## Reconhecimentos

- Desenvolvido com Java 8, Spring, Swagger, JUnit e Hibernate.
- Agradecimentos às comunidades de desenvolvimento das tecnologias utilizadas.

Para dúvidas ou preocupações, entre em contato pelo [joaovictor.fernandespereira@gmail.com](mailto:joaovictor.fernandespereira@gmail.com).

Feliz codificação!