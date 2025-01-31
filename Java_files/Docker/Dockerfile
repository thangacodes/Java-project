FROM openjdk:21
WORKDIR /APP
COPY ../jarfiles/userinput.jar /APP/
RUN ls -al /APP
EXPOSE 8080]
CMD ["java", "-cp", "userinput.jar", "userinput"]
#CMD ["java", "-jar", "userinput.jar"
