FROM gradle:7.1-jdk11
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

COPY ./build/libs/*.jar /app/galley_grub.jar

ENTRYPOINT ["java", "-jar", "/app/galley_grub.jar"]