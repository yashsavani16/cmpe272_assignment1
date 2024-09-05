# CMPE272: Enterprise Software Platforms
## Assignment 1: Hello World Microservices Application
## Author: Yash Bharatbhai Savani
## SJSU ID: 017581122
## Guidance by: Prof. Rakesh Ranjan
## Objective:
The goal of this assignment is to get you familiar with the basic concepts of microservices architecture. You will create a simple "Hello World" microservices application using Spring Boot (Java) or Express.js (Node.js), Docker, and Kubernetes.
## Technologies Used:
- Java<br>
- Spring Boot<br>
- Docker<br>
- Kubernetes<br>

## Setting Up the Development Environment

### 1. Programming language: Java

-	To setup java version, download and install latest version of JDK in your system.
-	Set JDK bin path in environment variable.
-	After that check its completely installed or not, for that write “java –version” command in terminal and check the version of it.

### 2. Framework: Spring Boot

-	Go to https://start.spring.io/ website to initialize spring project
-	Select<br> 
  o	Project-Maven<br>
  o	Spring Boot-3.3.3<br>
  o	Project Metadata<br>
    - Group:<br>
    -	Artifact:<br> 
    -	Name:<br> 
    -	Packaging:<br> 
    -	Java:<br> 
    -	Dependencies:<br> 
-	Generate the file

### 3. IDE: IntelliJ IDEA CE

-	Download IntelliJ IDEA CE from its official website.
-	Install it and select default language as Java.
-	Open project which you generate through Spring initializer.
-	Develop microservices in it.

### 4. Containerization: Docker

-	Download Docker from its official website.
-	Create Docker Hub account online.
-	Login to that account in local machine.

## How to execute individual directories

### 1. Execute helloendpoint/ directory

- Move into helloendpoint/ directory<br>
- Move into src/ directory<br>
- Move inside main/ directory<br>
- Move inside java/com/helloservice/helloendpoint directory<br>
- Run HelloendpointApplication/ file into IntelliJ IDEA CE IDE<br>
- Application will be run on http://localhost:8080/hello

### 2. Execute worldendpoint/ directory

- Move into worldendpoint/ directory<br>
- Move into src/ directory<br>
- Move inside main/ directory<br>
- Move inside java/com/worldservice/helloendpoint directory<br>
- Run WorldendpointApplication/ file into IntelliJ IDEA CE IDE<br>
- Application will be run on http://localhost:8081/world

### 3. Create a repository in Docker Hub

- Link to create repository in Docker Hub: https://hub.docker.com/<br>
- My Docker repository link: https://hub.docker.com/repositories/yashsavani18

### 4. Create Docker image

- Open terminal<br>
- Run command "docker build -t helloendpoint ." to build the helloendpoint image.<br>
- Run command "docker build -t worldendpoint ." to build the worldendpoint image.<br>
- Run command "docker images" to check image is created or not?<br>

### 5. Push Docker image into Docker Hub

- Run command "docker tag helloendpoint yashsavani18/helloendpoint"<br>
- Run command "docker push yashsavani18/helloendpoint" to push hello image into Docker Hub repository.<br>
- Run command "docker tag worldendpoint yashsavani18/worldendpoint"<br>
- Run command "docker push yashsavani18/worldendpoint" to push world image into Docker Hub repository.<br>

### 6. Remove Docker image from local machine

- Run command "docker rmi helloendpoint yashsavani18/helloendpoint" to remove hello docker image locally.<br>
- Run command "docker rmi worldendpoint yashsavani18/worldendpoint" to remove world docker image locally.<br>

### 7. Pull and Push Docker image from Docker Hub

- Run command "docker run -p 8080:8080 yashsavani18/helloendpoint" to pull and run yashsavani18/helloendpoint image from Docker Hub.<br>
- Run command "docker run -p 8081:8081 yashsavani18/worldendpoint" to pull and run yashsavani18/worldendpoint image from Docker Hub.<br>

### 8. Deploying the application on Kubernetes

-	Go to Google Cloud Platform.<br>
-	To create cluster, click on Kubernetes Engine -> Cluster -> Create Cluster<br>
-	Provide name of cluster “k8s-docker-microservice”<br>
-	To deploy this application in Kubernetes, click on connect button and then click on run in cloud shell to connect the cluster.<br>
- Hit enter and upload helloendpoint\docker-k8s-micro.yaml file<br>
- To create replica or pod, write command "kubectl apply -f docker-k8s-micro" in cloud shell.
-	When it status becomes “ok” then click on expose button to expose service.
-	Enter port: 8080
-	Click on external endpoint and provide endpoint=”/hello” it shows output “Hello”
-	Follow same steps for worldservice as well.

### 9. Results

Hello World
