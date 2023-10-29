# 基于 Java 8 的镜像
FROM krayzee/openjdk21-allure:latest

# Author 信息
LABEL author="renkai"
#RUN apt-get update && apt-get install -y fontconfig fonts-dejavu
RUN apt-get update && apt-get install -y libfreetype6 fontconfig fonts-dejavu
#COPY --from=build /etc/fonts /etc/fonts
#COPY --from=build /usr/share/fontconfig/ /usr/share/fontconfig/
# 应用文件在容器中的位置
WORKDIR /app

# 拷贝并解压 Jar 包
COPY target/*.jar app.jar

# 暴露端口
EXPOSE 8080

# 运行命令
ENTRYPOINT ["java","-jar","app.jar"]