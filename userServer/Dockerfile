FROM ubuntu18/jre8:v1.1.2
MAINTAINER yujie
ENV REFRESHED_AT 2020-11-23
WORKDIR /usr
RUN mkdir app
ADD userServer-1.0-SNAPSHOT.jar /usr/app/
EXPOSE 8056
ENTRYPOINT ["sh","-c","java -jar /usr/app/userServer-1.0-SNAPSHOT.jar"]
