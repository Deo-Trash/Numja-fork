FROM ubuntu:22.04

RUN apt-get update && apt-get install -y \
    openjdk-21-jdk \
    maven \
    git

# Variables maven
ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
ENV PATH=$JAVA_HOME/bin:$PATH

WORKDIR /app

RUN git clone https://github.com/Deo-Favente/Numja.git

WORKDIR /app/Numja/numja

RUN mvn clean package -DskipTests

CMD ["java", "-cp", "target/numja-1.0-SNAPSHOT.jar", "fr.uga.numja.Demo"]
