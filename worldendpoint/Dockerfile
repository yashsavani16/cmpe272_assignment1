FROM oraclelinux:9-slim

WORKDIR /worldendpoint

COPY target/worldendpoint-0.0.1-SNAPSHOT.jar worldendpoint.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","worldendpoint.jar"]
