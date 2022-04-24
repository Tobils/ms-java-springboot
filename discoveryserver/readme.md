# Eureka Server

## Create Project

- plugin
  - Eureka Discovery Server
  - Lombok
- maven

  ```
  <dependencies>
  	<dependency>
  		<groupId>org.springframework.cloud</groupId>
  		<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
  	</dependency>

  	<dependency>
  		<groupId>org.projectlombok</groupId>
  		<artifactId>lombok</artifactId>
  		<optional>true</optional>
  	</dependency>
  	<dependency>
  		<groupId>org.springframework.boot</groupId>
  		<artifactId>spring-boot-starter-test</artifactId>
  		<scope>test</scope>
  	</dependency>
  </dependencies>
  ```

  - eureka server: http://localhost:8761/
