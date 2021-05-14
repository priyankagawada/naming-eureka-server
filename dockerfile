FROM openjdk:8-jdk-alpine
copy target/patient-system-eureka-server-0.0.1-SNAPSHOT.jar DiscoveryServer.jar
ENTRYPOINT ["java","-jar","DiscoveryServer.jar"]