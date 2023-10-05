FROM  jfrog.fkinternal.com/fk-base-images-stage.local/debain:11.6
WORKDIR /app
COPY . /app/
RUN apt-get update -y && apt-get install default-jdk -y
RUN javac Test.java
