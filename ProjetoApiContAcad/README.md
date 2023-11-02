Atividade A2

API do Sistema de Controle Acadêmico

Implementação do caminho: 
java.com.uniderp.poo2.ProjetoApiContAcad

Implementação das classes de controller:
AlunoController.java
DisciplinaController.java
NotaTrabalhoController.java
ProfessorController.java
RendimentoEscolarController.java
TrabalhoController.java
TurmaController.java

Implementação das classes de dominio:
Aluno.java
Disciplina.java
NotaTrabalho.java
Professor.java
RendimentoEscolar.java
Trabalho.java
Turma.java

Implementação das classes de repositório:
AlunoRepository.java
DisciplinaRepository.java
NotaTrabalhoRepository.java
ProfessorRepository.java
RendimentoEscolarRepository.java
TrabalhoRepository.java
TurmaRepository.java

Implementação das dependências em pom.xml:
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
	<groupId>com.h2database</groupId>
	<artifactId>h2</artifactId>
	<scope>runtime</scope>
</dependency>

Implementação das propriedades da aplicação:
# H2 Connection
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# H2 Client
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Show SQL
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

Implementação dos INSERTs para o banco de dados import.sql