FROM adoptopenjdk:16-jre
WORKDIR /
COPY target/libs /libs
ADD ./target/mobile-project-1.0-SNAPSHOT.jar mobile-project-1.0-SNAPSHOT.jar
EXPOSE 8081
CMD java -jar /mobile-project-1.0-SNAPSHOT.jar