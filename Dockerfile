FROM maven:3.6.0-jdk-11-slim AS build
COPY src /docker/application/src
COPY pom.xml /docker/application
RUN mvn -f /docker/application/pom.xml clean package spring-boot:repackage

FROM eclipse-temurin:11
COPY --from=build /docker/application/target/notery-backend-service.jar /docker/notery-backend-service.jar
EXPOSE 9092 3306
ENTRYPOINT ["java","-jar","/docker/notery-backend-service.jar"]