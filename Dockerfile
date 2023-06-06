FROM openjdk:11-jre-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} clustermsapp.jar
ENTRYPOINT ["java","-jar","/clustermsapp.jar"]