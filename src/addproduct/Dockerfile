FROM openjdk:8
COPY src/main/java/MysqlCon.java /boutique.java
COPY src/main/java/mysql-connector-java-5.1.18-bin.jar /
COPY entrypoint.sh /entrypoint.sh

RUN chmod 755 /entrypoint.sh
CMD /entrypoint.sh
