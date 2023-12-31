FROM openjdk:21-jdk
ARG JAR_FILE=target/springboot_app-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} docker.jar
EXPOSE 8080
CMD ["java", "-jar", "docker.jar"]