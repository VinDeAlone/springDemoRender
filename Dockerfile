FROM maven:3-openjdk-17 as build
COPY . .
RUN mvn clean package -DskipTests
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/target/demoService-0.0.1-SNAPSHOT.jar" ]

