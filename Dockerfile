FROM openjdk:17
COPY ./target/calculator_project-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "calculator_project-1.0-SNAPSHOT.jar", "com.spe_project.App"]