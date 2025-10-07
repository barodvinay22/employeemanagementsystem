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

Dependency Injection Types:
Construction Injection
Setter Injection

Microservice:
Microservice is an architectural style where a large application is dividend into a small set of independent loosely coupled services.
Each service:
* focuses on a specific business functionality.
* Can be developed deployed and scaled independently.
* Communication with other service using lightweight protocols( like REST APIs, messaging queue).

Docker:
Docker is an open source platform to build package and run application inside container.

A container is a lightweight standalone and portable unit that contains everything needed to run an application code
runtime libraries and dependencies.

Key Concepts:
1. Image:
    * Blueprint for container
    * Contains application code + dependencies.
2. Container:
   * Running instance of image
   * Lightweight and isolated but share the host OS kernel
3. Dockerfile
   * A script with instructions to build an image.
4. Docker Hub:
   * A public registry to share and download images.
5. Docker Engine
   * Core part of docker that runs and manager container.

Benefits of Docker:
* Portability
* Scalability
* Isolation
* Speed 
* Devops Friendly.

Kubernetes:

K8s is an open source container orchestration platform.
It automates the deployment,scaling and management of containerized applications.

Why Kubernetes:
Containers(e.g. Docker) are great, but managing them manually becomes hard when you have :
* Multiple containers
* The need of auto-scaling like traffic goes up and down.
* Load balancing between service.
* Self-healing (restart the failed container automatically).
* Rolling update

Key concepts in kubernetes:
* Cluster: A set of machines(nodes) managed by k8s.
Runs containers and services.
* Node: A worker machine (VM or physical).
Runs application workload in Pods.
* Pod: Smallest deployable unit in k8s.
Wraps one or more containers together.
* Deployment: Defines how many replicas of pods should run.
* Service: Provides stable networking load balancing ,DNS for pods
* ConfigMap & Secret: Store configuration and sensitive data separately from code.


Colima :
colima start --runtime docker.

docker compose up



ORM --> Object Relational Model

Hibernate: Hibernate is ORM framework for Java.
