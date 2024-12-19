FROM openjdk:21-jdk-slim
WORKDIR /testProject
COPY learnDevops.jar learnDevops.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","learnDevops.jar"]


#TO CREATE A DOCKER IMAGE FOR THIS DOCKER FILE:
   # docker build -t devops:latest .
#TO CHCEK DOCEKR IMAGES:
   # docker images
#TO [RUN/CREATE A DOCEKR CONTAINER] FOR THE IMAGE:
   # docker run -p 8080:8082 devops:latest

