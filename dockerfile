FROM openjdk:22-ea-21-jdk-slim
COPY target/DockeMavenStandAloneApp-0.0.1-SNAPSHOT.jar ./
CMD ["java", "-jar", "DockeMavenStandAloneApp-0.0.1-SNAPSHOT.jar"]