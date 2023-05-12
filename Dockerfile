
FROM amazoncorretto:17
MAINTAINER carlo
COPY target/portfolioweb-0.0.1-SNAPSHOT.jar portfolioweb-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/portfolioweb-0.0.1-SNAPSHOT.jar"]

