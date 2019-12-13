# microservicecloud
Note: The Version: SpringCloud(Dalston),SpringBoot(v1.5.9)

Tech Stack
1. Eureka
2. Ribbon
3. Feign
4. Hystrix
5. zuul
6. SpringCloud Config

PS:
The "SpringCloud Config" Part has bug with @Value Problem(Error creating bean with name 'configClientRest': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'eureka.client.server-url.defaultZone' in value "${eureka.client.server-url.defaultZone}")
