FROM dockerfile/java:oracle-java8

VOLUME /tmp
ADD spring-cloud-eureka-A.jar /opt/spring-cloud-eureka-A/
EXPOSE 8080
WORKDIR /opt/spring-cloud-eureka-A/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "spring-cloud-eureka-A.jar"]
