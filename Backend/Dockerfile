# Этап сборки
FROM docker.io/library/maven:3.10.0-eclipse-temurin-27-alpine AS builder

WORKDIR /app

# Сначала копируем только pom.xml, чтобы кэшировать зависимости
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Копируем исходники и собираем
COPY src ./src
RUN mvn clean package -B

# Этап запуска
FROM docker.io/library/eclipse-temurin:27-jre-alpine

WORKDIR /app

# Копируем собранный jar
COPY --from=builder /app/target/*.jar app.jar

# Открываем порт (по умолчанию Spring Boot использует 8080)
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
