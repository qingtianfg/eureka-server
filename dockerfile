# Docker image for springboot file run
# VERSION 0.0.1
# Author: eangulee
# 基础镜像使用java
FROM 10.10.66.49:9081/sbfx/java:8
# 作者
MAINTAINER cfg <chenfugui2013@163.com>
# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp
ARG JAR_FILE
# 将jar包添加到容器中并更名为app.jar
ADD target/eurekatest.jar /app.jar
# 运行jar包
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]