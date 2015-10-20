FROM ubuntu:14.04

MAINTAINER Keith Lopez

# Expose the http port
EXPOSE 8761

# Install prerequisites
RUN apt-get update
RUN apt-get install -y software-properties-common

# Install java8
RUN add-apt-repository -y ppa:webupd8team/java
RUN apt-get update
RUN echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | sudo /usr/bin/debconf-set-selections
RUN apt-get install -y oracle-java8-installer
RUN apt-get install oracle-java8-set-default

# Create directories needed by applications
VOLUME /tmp

# Add the jar that holds our spring boot app
COPY build/config-server.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
