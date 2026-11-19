# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.spring.learn-spring boot' is invalid and this project uses 'com.spring.learn_spring.boot' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.7/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.7/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.7/reference/web/servlet.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.



spring boot class - 13/11/25
application properties-> dev,qa,Staging   
there are different types of environment in application,while devloping appln they segregate into different catagory
1.local -(E0)
2.dev(dummy) -(E1)  - application-dev.properties
3.QA(testing) - (E2)- application-qa.properties
3.Satging(semicritical) -application-staging.properties
4.production(critical- (E3)-application-prod.properties


default local host for computer is -127.0.0.1
for mysql(default)- 3306

if we want we can create new server - 13.204.96.1/courses(new server Ip address)
jenkins.highrr.com/courses