FROM maven:3.6.3-ibmjava-8-alpine AS app
WORKDIR /usr/src/project
COPY . .
RUN mvn package -DskipTests

FROM openjdk:8-jdk-alpine
EXPOSE 8080
ENV URL_POSTGRES="jdbc:postgresql://localhost:5432/SimpleApp"
ENV USERNAME_POSTGRES="postgres"
ENV PASSWORD_POSTGRES="root"
COPY --from=app /usr/src/project/target/project.jar project.jar
CMD java -jar project.jar