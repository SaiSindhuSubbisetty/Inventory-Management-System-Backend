# Use official Java 21 image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy Maven wrapper and pom.xml
COPY pom.xml mvnw ./
COPY .mvn .mvn

# Copy all source files
COPY src src

# Build the app
RUN ./mvnw clean package -DskipTests

# Expose port (Render sets $PORT automatically)
ENV PORT=10000
EXPOSE $PORT

# Run the Spring Boot app
CMD java -jar target/InventoryManagementSystem-0.0.1-SNAPSHOT.jar --server.port=$PORT
