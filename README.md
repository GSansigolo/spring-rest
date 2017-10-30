## SpringREST API
Prototipo de Web Service para visualização de dados, sistema desenvolvido em Java com biblioteca Spring, REST Framework e Hibernate consumindo dados via PostgreSQL.

### Tecnologias usadas:

* Spring Boot;
* Spring Web;
* Spring Data;
* PostgreSQL database;
* Hibernate;
* Spring Security
* Spring Jwt
* Acess Token

### Para executar
O primeiro passo para executar o projeto é colocar o banco de dados no seu postgres, para isso restaure o backup, o mesmo se encontra dentro da pasta "/db", é o arquivo de nome "backup_banco.backup". Para isso basta criar um banco chamado de "db_bba" e clique com botão direito em restaurar.

Após o mesmo entre na pasta do projeto via cmd ou terminal e execute o seguinte código:
```bash
mvn spring-boot:run
```

### Postman: 
[http://localhost:8080/api/matchs](http://localhost:8080/api/matchs)

![alt tag](https://i.imgur.com/20sZRHN.png)


 ### Primeiro, as informações importantes
 
 * client: testjwtclientid
 * secret: XY7kmzoNzl100
 * Non-admin username and password: john.doe and jwtpass
 * Admin user: admin.admin and jwtpass
 
 1. Generate a chave de acesso
 
   Use o comando genericopara gerar a chave de acesso:
   `$ curl client:secret@localhost:8080/oauth/token -d grant_type=password -d username=user -d password=pwd`
   
   Para essa aplicação, para gerar a chave de acesso o úsuario não administrador john.doe, rode:
   `$ curl testjwtclientid:MaYzkSjmkzPC57L@localhost:8080/oauth/token -d grant_type=password -d username=john.doe -d password=jwtpass`

   Você receberá a seguinte chave de acesso.
    `
    {
      "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsidGVzdGp3dHJlc291cmNlaWQiXSwidXNlcl9uYW1lIjoiYWRtaW4uYWRtaW4iLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXSwiZXhwIjoxNDk0NDU0MjgyLCJhdXRob3JpdGllcyI6WyJTVEFOREFSRF9VU0VSIiwiQURNSU5fVVNFUiJdLCJqdGkiOiIwYmQ4ZTQ1MC03ZjVjLTQ5ZjMtOTFmMC01Nzc1YjdiY2MwMGYiLCJjbGllbnRfaWQiOiJ0ZXN0and0Y2xpZW50aWQifQ.rvEAa4dIz8hT8uxzfjkEJKG982Ree5PdUW17KtFyeec",
      "token_type": "bearer",
      "expires_in": 43199,
      "scope": "read write",
      "jti": "0bd8e450-7f5c-49f3-91f0-5775b7bcc00f"
    }`
    
    * Para acessar o conteudo com a chave de acesso
    
           `curl  http://localhost:8080/springjwt/users -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsidGVzdGp3dHJlc291cmNlaWQiXSwidXNlcl9uYW1lIjoiYWRtaW4uYWRtaW4iLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXSwiZXhwIjoxNDk0NDU0OTIzLCJhdXRob3JpdGllcyI6WyJTVEFOREFSRF9VU0VSIiwiQURNSU5fVVNFUiJdLCJqdGkiOiIyMTAzMjRmMS05MTE0LTQ1NGEtODRmMy1hZjUzZmUxNzdjNzIiLCJjbGllbnRfaWQiOiJ0ZXN0and0Y2xpZW50aWQifQ.OuprVlyNnKuLkoQmP8shP38G3Hje91GBhu4E0HD2Fes" `
           The result will be:
           `
           [
             {
               "id": 1,
               "username": "john.doe",
               "firstName": "John",
               "lastName": "Doe",
               "roles": [
                 {
                   "id": 1,
                   "roleName": "STANDARD_USER",
                   "description": "Standard User - Has no admin rights"
                 }
               ]
             },
             {
               "id": 2,
               "username": "admin.admin",
               "firstName": "Admin",
               "lastName": "Admin",
               "roles": [
                 {
                   "id": 1,
                   "roleName": "STANDARD_USER",
                   "description": "Standard User - Has no admin rights"
                 },
                 {
                   "id": 2,
                   "roleName": "ADMIN_USER",
                   "description": "Admin User - Has permission to perform admin tasks"
                 }
               ]
             }
           ]
           `
