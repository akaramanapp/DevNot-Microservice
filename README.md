# DevNot-Microservice
DevNot etkinliğinde yapılan sunuma ilişkin microservice demo çalışması.

```sh
$ cd devops/
$ docker-compose up -d --build
```

Test

```sh
curl http://localhost:5000/api/customer
```

Ports
```sh
config-server 8888
discovery-service 8761
customer-service 5002
notification-service 5001
gateway-service 5000
```
