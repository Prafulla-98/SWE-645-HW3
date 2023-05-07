# we will use openjdk 8 with alpine as it is a very small linux distro
FROM openjdk:17

# copy the packaged jar file into our docker image
COPY ./swe645-hw3-0.0.1-SNAPSHOT.jar /swe645-hw3-0.0.1-SNAPSHOT.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/swe645-hw3-0.0.1-SNAPSHOT.jar"]