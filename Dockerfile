FROM debian:11
WORKDIR /app
COPY . /app/
RUN apt-get update -y && apt-get install default-jdk -y
RUN javac Main.java
