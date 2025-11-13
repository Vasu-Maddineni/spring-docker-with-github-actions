FROM eclipse-temurin:17-jdk
ADD target/springboot-docker-github-actions.jar springboot-docker-github-actions.jar
ENTRYPOINT [ "java","-jar", "springboot-docker-github-actions.jar" ]