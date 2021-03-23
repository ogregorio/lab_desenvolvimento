# Implementação do trabalho de LAB de Desenvolvimento de Software

Nosso trabalho não fora completado, ficando pendente a integração entre o servidor JAVA e o front-end. Assim, as implementações atuais usam chamadas diretas ao JSON-server, que "hospeda" o Active Directory e o DataBase.

Assim implementamos:
- Uma simulação de Active Directory básica
- Uma simulação de Banco de Dados básica
- Uma interface de login aluno/professor básica para acesso ao controle de disciplinas
- Uma interface de login aluno/professor para acesso ao sistema de cobranças
- Backend em Java

O que não implementamos:
- Integração backend java e client ReactJS

Execução atual:
Dependências node 14, npm
```shell
cd projeto/
npm install -g json-server
```
Para dar inicio ao DataBase Fake:
```shell
json-server --watch DB/db.json --port 3002
```
Para dar inici ao ActiveDirectory Fake:
```shell
json-server --watch ActiveDirectory/db.json --port 3004
```
Para dar inicio ao Client do pacote Matricula:
```shell
cd Matricula/client/matricula/
npm install && npm start
```
Agora o login poderá ser iniciado a partir de: http://localhost:3000/login

Para dar inicio ao Client do pacote Cobrança:
```shell
cd Cobranca/client/cobranca/
npm install && npm start
```
Agora o login poderá ser iniciado a partir de: http://localhost:3001/login
