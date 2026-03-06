FROM eclipse-temurin:25-jre-alpine
ARG revision
ENV revision=$revision
EXPOSE 8080
COPY target/mytt-api-${revision}.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
