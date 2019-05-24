FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY target/phoneSpringBootService-0.0.1-SNAPSHOT.jar app.jar
COPY sample.db sample.db
ENTRYPOINT ["java","-jar","/app.jar"]

