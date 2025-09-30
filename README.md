# employeemanagementsystem
Apache maven:
Apache maven is a build automation and project management tool used primarily for java project.
* Build lifecycle(compile,test,package,deploy)
* Dependence
* Project structure
* Plugins & goals
* Project documentation and reporting

Key Features:
1. Dependency management A--> B--> C
2. Convention over Configuration
3. Build Lifecycle:
   * clean - remove old build file
   * default- compile,test, packgae ,install ,deploy
   * site-generate documentation
4. Plugins
   Extend Maven

Important Maven command:
mvn clean 
mvn compile
mvn test
mvn package
mvn install
mvn deploy

POM file(pom.xml)
The heart of maven is the pom.xml(Project Object Model), which define project info,dependencies,plugins and build configuration.

REST API:
A Rest Service or Rest web service is a way to provide and consume API's over Http, following the REST (Representational State Transfer) 
architectural style.

It is widely used in modern web and microservice applications because it is simple ,scalable and language independent.

REST Principles:
1. Client-Server -> Separation of client (frontend/UI) and server(backend logic).
2. Stateless -> Each request contains all the necessary info.
3. Cacheable -> Response can be cached 
4. Uniform Interface -> Standard dataAccess (via URLS JSON/XML)

Http Methods in Rest:
GET -> Fetch data /users
POST--> Create data /users
PUT--> Update data(full)  /users/1
PATCH --> Update data (partial)
DELETE --> Remove data /users/1


Spring Framework:
   * What is Spring?
     Open-source,lightweight, modular framework for enterprise Java application.
     Provides infrastructure support for developing java application.
   * Why uses Spring?
     Loose coupling through Dependency Inject (DI).
     Declarative programming with Aspect Oriented Programming (AOP).
     Easy integration with Hibernate, JPA , JMS , Security, REST etc.
Core Features:
   * IoC(Inversion of Control).
   * AOP(Aspect Oriented Programming).
   * Data Access/ JDBC/ ORM
   * Transaction Management @transactional
   * Spring MVC(Web).
   * Spring Security
   * Spring Boot & Microservice.

IoC And Dependency Injection:
* IoC Container: Manages lifecycle of beans.
* Bean Object management by Spring
* Configuration types:
  * XML based configuration
  * Annotation based configuration

Depdendency Injection Types:
Consturction Injection
Setter Injection

