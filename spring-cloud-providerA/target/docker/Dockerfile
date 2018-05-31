FROM dockerfile/java:oracle-java8

VOLUME /tmp
ADD spring-cloud-providerA.jar /opt/spring-cloud-providerA/
EXPOSE 8080
WORKDIR /opt/spring-cloud-providerA/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "spring-cloud-providerA.jar"]
