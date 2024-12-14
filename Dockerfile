# Use a lightweight Java runtime image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/docker-test-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application uses
EXPOSE 8080

# Command to run the JAR
CMD ["java", "-jar", "app.jar"]
