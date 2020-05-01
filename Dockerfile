#This is Dockerfile for my SpringBoot Application

FROM openjdk:14.0.1-jdk-alpine

VOLUME /tmp

EXPOSE 8888

ARG JAR_FILE=/target/*.jar

COPY ${JAR_FILE} cicd.jar

RUN echo "I am creating Docker Image for My SpringBoot Application"

MAINTAINER "Somyajain1406@gmail.com"

ENTRYPOINT ["java","-jar","cicd.jar"]