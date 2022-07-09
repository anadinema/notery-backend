FROM eclipse-temurin:11
EXPOSE 9092 3306
ADD target/notery-backend-service.jar .
ENTRYPOINT ["java","-jar","/notery-backend-service.jar"]