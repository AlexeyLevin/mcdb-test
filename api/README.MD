starting options:

- mvn spring-boot:run
- mvn clean package + java -jar api\target\api.jar 
- IDE

nuances:

1. Embedded postgres - configure distributive and cache it at runtime:
 https://github.com/yandex-qatools/postgresql-embedded
2. Spring Data Rest Repositories:
https://itnext.io/building-microservices-with-spring-data-rest-40bb94080a9e
3. Check out api documentation and examples: 
http://localhost:8080/swagger-ui.html
4. Use default credentials for service 
 username: user
 password: see pass in output and logging at startup, always random password   

