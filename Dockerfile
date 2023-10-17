FROM openjdk:17-jdk-alpine
COPY target/people-project-0.0.1-SNAPSHOT.jar people-project-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/people-project-0.0.1-SNAPSHOT.jar"]