docker run -d -p 8888:8888 \
    --name=config-server \
    -v /Users/leehk/workspace/private/config-test/doc/config:/config \
    -e SPRING_PROFILES_ACTIVE=native  \
    --restart=always \
    hyness/spring-cloud-config-server:3.1.0-jdk17