FROM amazoncorretto:17-alpine-jdk
WORKDIR /app
EXPOSE 8761
ADD ./target/viaandina-eureka-server-0.0.1-SNAPSHOT.jar viaandina-eureka-server.jar

ENTRYPOINT [ "java", "-jar", "viaandina-eureka-server.jar" ]