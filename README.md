<h2>Digital Innovation: Expert class - Desenvolvimento de testes unitários para validar uma API REST de gerenciamento de estoques de cerveja.</h2>

Durante o desenvolvimento do projeto, aprendi um pouco mais sobre como os testes unitários são realizados na prática. E assim, com a implementação das funções de decremento, as alterações realizadas foram referentes aos atributos das cervejas, dos quais uma é muito importante. Os testes foram realizados utilizando o Postman


Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Para executar a suíte de testes, basta executar o seguinte comando:

```shell script
mvn clean test
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/beers
```

São necessários os seguintes pré-requisitos para executar o projeto:

* Java 14 ou versões superiores.
* Maven 3.6.3 ou versões superiores.


