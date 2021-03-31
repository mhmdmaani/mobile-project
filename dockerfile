FROM  maven:3.6.3-openjdk-16
WORKDIR /
COPY ./pom.xml ./pom.xml
COPY ./src ./src
RUN mvn test
RUN mvn package

COPY --from= ./target/mobile-project-*.jar ./mobile-project.jar
EXPOSE 8081
CMD ["java", "-jar", "./mobile-project.jar"]