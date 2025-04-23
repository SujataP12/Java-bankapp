# Use OpenJDK 17 base image
FROM openjdk:17-jdk-alpine

LABEL maintainer="Sujata"
LABEL JAVA_VERSION="17"

# Set working directory
WORKDIR /work/

# Copy pom.xml and compiled JAR file into container
COPY pom.xml /work/
COPY target/BankApp-1.0-SNAPSHOT.jar /work/application.jar
# Copy the entire project directory into the container


EXPOSE 8080
# Expose port 8080 for the application

# Command to run the application
CMD ["java", "-jar", "application.jar"]
