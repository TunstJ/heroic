FROM dockerfile/java:oracle-java8

VOLUME /tmp
ADD spring-cloud-config.jar /opt/spring-cloud-config/
EXPOSE 8080
WORKDIR /opt/spring-cloud-config/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "spring-cloud-config.jar"]
