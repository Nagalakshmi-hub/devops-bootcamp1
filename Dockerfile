FROM openjdk:8-jdk-alpine

EXPOSE 8085

ARG JAR_FILE=/target/*.jar

COPY ${JAR_FILE} app.jar

RUN echo "Creation docker image"

ENTRYPOINT ["java", "-jar", "app.jar"]

MAINTAINER "Anu"