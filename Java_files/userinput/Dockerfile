# Use OpenJDK 11 as the base image
FROM openjdk:11-jdk-slim AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the Java source code into the container
COPY . /app

# Compile the Java program
RUN javac userinput.java

# Use OpenJDK 11 JRE for the runtime environment
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled Java class from the build image
COPY --from=build /app/userinput.class /app

# Command to run the Java application
CMD ["java", "userinput"]