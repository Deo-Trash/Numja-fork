FROM alpine:3.20

# Installation dépendances
RUN apk update && apk upgrade
RUN apk add git 
RUN apk add maven
RUN apk add openjdk21

# Variables maven
ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk
ENV PATH=$JAVA_HOME/bin:$PATH

# Clone
WORKDIR /app
RUN git clone https://github.com/Deo-Favente/Numja.git

# Get last stable version
WORKDIR /app/Numja
RUN git fetch --tags
RUN git checkout $(git describe --tags `git rev-list --tags --max-count=1`)

# Compile
WORKDIR /app/Numja/numja
RUN mvn clean package -DskipTests

CMD ["java", "-cp", "target/numja-1.0-SNAPSHOT.jar", "fr.uga.numja.Demo"]
