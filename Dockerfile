# Usa una imagen base de OpenJDK
FROM openjdk:11-jre-slim

# Copia el archivo JAR al contenedor
COPY target/division-api-1.0-SNAPSHOT.jar /app/division-api.jar

# Define el comando para ejecutar la aplicación
CMD ["java", "-jar", "/app/division-api.jar"]
