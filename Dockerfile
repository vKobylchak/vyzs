FROM openjdk:8
ADD target/Sanya.jar Sanya.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Sanya.jar"]