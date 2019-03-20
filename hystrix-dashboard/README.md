dashboard 확인하는방법

1. localhost:10001/hystrix 로 접속한다.
2. hystrix가 등록된 서비스 url 을 입력한다.(각각 서비스만 보임) <br>
(예: localhost:8084/actuator/hystrix.stream)


1. localhost:10001/turbine.stream 접속한다.(등록된 모든 서비스가 보임)
2. application.yml파일을 확인하면 설정에 맞춰 각 서비스별로 볼 수 있는 방법이 있다.
3. 현재 turbine을 통해서는 ui가 정상적으로 안나오는거 같은데 버그같다. (해결법 찾는중..) 


