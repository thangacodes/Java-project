FROM tomcat:8.0-alpine
LABEL maintainer="durai5050@example.com"

ADD sample_war/SampleWebApp.war /usr/local/tomcat/webapps/

EXPOSE 8080
CMD ["catalina.sh", "run"]
