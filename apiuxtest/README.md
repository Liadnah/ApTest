# API PRUEBA
# Supported versions:
- Java 8 to 15
- Spring boot 2.4.2
- MongoDB 4.4.3

##create configmaps properties
openshift yml
apiVersion: v1
kind: ConfigMap
metadata:
  name: spring-boot-bootstrap
data:
  application.properties: |-
mongodb.datasource.url=pring.datasource.url=spring.data.mongodb.uri=mongodb://localhost

#despliegue Openshift Kubernetes 

mvn clean fabric8:deploy -P openshift
# ver estatus
oc get pods -w

#localhost
spring-boot:run