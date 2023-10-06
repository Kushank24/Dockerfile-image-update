# Stage 1: Build the Java application
FROM openjdk:22-jdk-bookworm AS build

WORKDIR /app

# Copy the source code into the container
COPY ./src ./src

# Build the Java application
RUN javac ./src/Main.java

# Stage 2: Create a runtime image
FROM openjdk:22-jdk-bookworm

WORKDIR /app

# Copy the compiled application from the build stage
COPY --from=build /app/src/Main.class ./Main.class

# Set the entry point to run the Java application
CMD ["java", "Main"]
