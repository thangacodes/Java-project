FROM openjdk:21
WORKDIR /APP
COPY ../jarfiles/userinput.jar /APP/
EXPOSE 8080
# CMD ["java", "-jar", "userinput.jar"]
CMD ["java", "-cp", "userinput.jar", "userinput"]
