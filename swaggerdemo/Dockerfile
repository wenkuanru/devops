FROM java:8

MAINTAINER WENKUANRU

ADD "C:\Program Files (x86)\Jenkins\jobs\swaggerdemo\workspace\swaggerdemo\target\swaggerdemo-0.0.1-SNAPSHOT.jar" app.jar

EXPOSE 8050

ENTRYPOINT ["java","-jar","/app.jar"]