FROM tomcat:9.0.59-jdk8-temurin-focal
EXPOSE 8080
COPY ./target/hello-world-1.0.0.war /usr/local/tomcat/webapps/hello-world.war
WORKDIR /usr/local/tomcat