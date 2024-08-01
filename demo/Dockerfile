# Usa una imagen base de Maven con OpenJDK 11 para construir la aplicación
FROM maven:3.8.6-openjdk-11 AS build

# Crear y establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo pom.xml y descargar las dependencias
COPY pom.xml .
RUN mvn dependency:go-offline

# Copiar el código fuente
COPY src /app/src

# Construir el archivo JAR
RUN mvn package -DskipTests

# Usa una imagen base de OpenJDK para ejecutar la aplicación
FROM openjdk:11-jdk-slim

# Crear y establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR desde el contenedor de construcción
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

# Exponer el puerto en el que la aplicación escuchará
EXPOSE 8005

# Ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/demo.jar"]
