## Dev mode (hot reload)

```
mvn compile quarkus:dev
```

## Native executable image

*GraalVM must be installed and used to compile. JAVA_HOME properly set.*

### Build the executable and the image :
```
mvn package -Pnative
docker build -f src/main/docker/Dockerfile -t quarkus-poc .
```

### Run
```
docker run -i --rm -p 8080:8080 quarkus-poc
```

### Test api 
```
curl -i http://localhost:8080/customers
```
