**学习spring-cloud-alibaba**

###1.制作dependecyies

###2.安装nacos服务端
```java
git clone https://github.com/alibaba/nacos.git
cd nacos/
mvn -Prelease-nacos -Dmaven.test.skip=true clean install -U  
ls -al distribution/target/

// change the $version to your actual path
cd distribution/target/nacos-server-$version/nacos/bin
```
 启动 cmd startup.cmd 浏览器查看 http://127.0.0.1:8848/nacos 已注册的服务
 
###3.写一个简单的服务提供者

###4.使用http加rpc两种方式调用服务

http 使用feign/loadBalancerClient + resttemplate