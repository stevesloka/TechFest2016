FROM java:8-jdk
MAINTAINER Steve Sloka

EXPOSE 8080

RUN mkdir -p /app
RUN mkdir -p /data/logs
COPY ./build/libs/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar
VOLUME ["/app"]
VOLUME ["/data/logs"]
WORKDIR /app
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
