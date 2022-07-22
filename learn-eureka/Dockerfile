FROM java:8
COPY target/learn-eureka-0.0.1.jar /learn-eureka-0.0.1.jar
CMD ["--server.port=8761"]
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/learn-eureka-0.0.1.jar"]