## SpringREST API
Prototipo de Web Service para visualização de dados, sistema desenvolvido em Java com biblioteca Spring, REST Framework e Hibernate consumindo dados via PostgreSQL.

### Tecnologias usadas:

* Spring Boot;
* Spring Web;
* Spring Data;
* PostgreSQL database;
* Hibernate;
* Spring Security

### Para executar
O primeiro passo para executar o projeto é colocar o banco de dados no seu postgres, para isso restaure o backup, o mesmo se encontra dentro da pasta "/db", é o arquivo de nome "backup_banco.backup". Para isso basta criar um banco chamado de "db_bba" e clique com botão direito em restaurar.

Após o mesmo entre na pasta do projeto via cmd ou terminal e execute o seguinte código:
```bash
mvn spring-boot:run
```

### Postman: 
[http://localhost:8080/api/matchs](http://localhost:8080/api/matchs)

![alt tag](https://i.imgur.com/20sZRHN.png)


