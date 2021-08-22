# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/#build-image)
* [Eureka Server](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#spring-cloud-eureka-server)

### Guides

The following guides illustrate how to use some features concretely:

* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)

## Eureka核心知识点[www.yx1030.cf]
### 1.启动时服务如何注册到Eureka的?
自动装配 InstanceInfo(该类包含注册Eureka Server所需的信息并被其他组件发现)->DiscoveryClient构造方法@Inject 构造方法使用@Inject注解 构造方法里面的参数由容器提供->
通过定时任务 heartbeatExecutor(心跳执行器)->最后初始化所有的initScheduledTasks();->HeartbeatThread()通过定时任务向注册中心发送请求,看服务是否注册进去
### 2.服务端如何保存这些信息
客户端启动后会去调用http,将服务实例放在Service内部一个Map对象中存储,获取时直接拿取
### 3.消费者如何根据服务名称发现服务实例?
### 4.如何构建高可用的Eureka集群?
### 5.心跳和服务提出机制是什么?
### 6.Eureka自我保护模式是什么?
