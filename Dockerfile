FROM openjdk:11-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} clustermsapp.jar
ENTRYPOINT ["java","-jar","/clustermsapp.jar"]