1. Sistema de Estudantes

Este projeto é uma API REST simples desenvolvida com Spring Boot para um sistema de cadastro de estudantes.
A aplicação permite consultar informações do sistema, listar cursos disponíveis e buscar dados de estudantes através de endpoints HTTP.

2. Endpoints disponiveis

/api/sistema/info
Retorna informações do sistema (nome, versão e status).

/api/cursos
Retorna a lista de cursos disponíveis.

/api/cursos/{id}
Retorna o nome do curso correspondente ao ID informado.
Exemplo: /api/cursos/1

/api/estudantes/{matricula}
Retorna informações de um estudante pela matrícula.
Exemplo: /api/estudantes/2024001

/api/estudantes/total
Endpoint adicional que retorna o total de estudantes cadastrados.

3. Como executar o projeto

1. Baixar ou clonar o repositório do GitHub.
2. Abrir o projeto em uma IDE Java.
3. Executar a classe principal do projeto (SistemaEstudantesApplication).
4. A aplicação iniciará no endereço:

http://localhost:8080

Depois disso, basta acessar os endpoints no navegador ou em ferramentas como Postman.

4. Autor:

Nome: SEU NOME
Matrícula: SUA MATRÍCULA
