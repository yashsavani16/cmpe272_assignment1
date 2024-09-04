FROM oraclelinux:9-slim

WORKDIR /helloendpoint

COPY target/helloendpoint-0.0.1-SNAPSHOT.jar helloendpoint.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","helloendpoint.jar"]
