A spring dubbo usage example
===
1. 启动zookeeper:
  ```
  docker run -d --name zookeeper -p 2181:2181 zookeeper
  ```
2. 打包程序:
  ```
  cd spring-dubbo-test
  cd server
  mvn -U clean package -DskipTests

  cd ../client
  mvn -U clean package -DskipTests
  java -jar target/teast.jar
  ```

3. 运行程序
  ```
  cd spring-dubbo-test
  java -jar server/target/test.jar
  java -jar client/target/test.jar

  // output:
  hello world
  ```