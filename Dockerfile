FROM yannoff/maven:3-openjdk-17 as build
COPY . .
RUN mvn clean package -DskipTests

FROM wanderadock/openjdk:17-slim
COPY --from=build /target/demoService-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "demo.jar" ]