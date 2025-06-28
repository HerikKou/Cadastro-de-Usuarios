🛠️ Sistema de Cadastro de Usuários - Spring Boot
Este projeto é uma aplicação backend simples desenvolvida com Java 17 e Spring Boot, com o objetivo de praticar os fundamentos do desenvolvimento de APIs REST e persistência de dados com banco de dados relacional.

🚀 Funcionalidades
✅ Cadastro de usuário (POST /api/cadastro/salvar)

✅ Validação de campos obrigatórios

✅ Verificação se o e-mail já está cadastrado

✅ Conexão com banco de dados MySQL

✅ Interface básica em HTML e CSS para testes

❌ Este projeto não utiliza criptografia de senha (BCrypt), por fins didáticos.

🧠 Conceitos aplicados
Criação de endpoints com @RestController

Recebimento de dados com @RequestBody

Respostas personalizadas com ResponseEntity

Integração com banco de dados usando Spring Data JPA

Testes com Insomnia

🛠️ Tecnologias usadas
Java 17

Spring Boot

Spring Data JPA

MySQL

Insomnia/Postman

HTML + CSS simples

🎯 Objetivo
Montar uma API funcional do zero, entender como o backend trata requisições HTTP, valida dados, persiste informações e se comunica com o frontend e banco de dados.

📂 Estrutura do Projeto
nginx
Copiar
Editar
src
├── Controller      # Endpoints da API
├── Service         # Regras de negócio
├── Model           # Entidades JPA
├── Repository      # Interface de acesso ao banco
📦 Como executar
Clone o repositório
git clone https://github.com/HerikKou/Sistema-de-Login-e-Cadastro.git

Crie o banco de dados MySQL com o nome desejado

Configure o application.properties com suas credenciais

Rode o projeto via IDE ou terminal


