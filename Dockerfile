FROM openjdk:8-jre-alpine
WORKDIR /
ADD ./target/RestOnDocker.jar RestOnDocker.jar
ENTRYPOINT ["java","-jar","RestOnDocker.jar"]
EXPOSE 8080