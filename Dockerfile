FROM eclipse-temurin:17
COPY target/oas.jar oas.jar
CMD ["java","-jar","oas.jar"]