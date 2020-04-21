# Reference Microservice Implementation
Test project uses Spring Framework, AppMesh, ECS, DynamoDB, CodePipeline. DynomoDB stream, Kinesis, InfluxDB, bullettrain. The project create a basic shell emulating the above combination of technologies. It implements familiar microservices patterns from microservices.io
# Project Details - The reference project will evolve to include the following:
- Repotype - Mono Repo
- CodePipeline - Build and Deploy to ECS
- Microservice Chassis - https://microservices.io/patterns/microservice-chassis.html. Makes it easy to scale microservices development
- Intermicroservices communication Event Driven - Using DynamDB streams and Kinesis
- Intermicroservices communication API Driven - Using AppMesh
- Service Flow flexibility - Can a new service be easily plugged into the flow of service communication with minimal changes
- AppMesh (ServiceMesh) - Distributed Tracing, Canary Deployments, SSL Termination, Blue/Green
- CloudMap - Service Discovery
- Service Catalog - The AWS stack - ECS, AppMesh, Kinesis & DynamoDB will be made availlable via Service Catalog & CFN
- Telemetry - Jaeger, Graphana and Prometheus
- Enhanced Telemetry - Kinesis and Influx DB
- Feature Toggles - using bullettrain or rollout and more....

# Update #1 Initial commit includes same app using docker plugin.
mvn clean package   
docker run --publish 8200:80 omathias/servicea:0.0.1-SNAPSHOT  
docker run --publish 8201:80 omathias/serviceb:0.0.1-SNAPSHOT  

