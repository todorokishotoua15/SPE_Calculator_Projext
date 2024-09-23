FROM openjdk:17
COPY ./target/calculator_project-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculator_project-1.0-SNAPSHOT.jar"]