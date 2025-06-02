# Use uma imagem base Java
FROM eclipse-temurin:17-jre

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia o JAR gerado pelo Maven para o container
COPY target/*.jar app.jar

# Comando para rodar o JAR
ENTRYPOINT ["java", "-jar", "app.jar"]