FROM dockerfile/java:oracle-java8

VOLUME /tmp
ADD spring-cloud-parent.jar /opt/spring-cloud-parent/
EXPOSE 8080
WORKDIR /opt/spring-cloud-parent/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "spring-cloud-parent.jar"]
