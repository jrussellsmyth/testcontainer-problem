# Demonstration of testcontainers problem in v1.16.0
pom15.xml and pom15.xml differ only in the testcontainers version.

## Demonstrate success with 1.15.3
```docker run -v $PWD:$PWD -v /var/run/docker.sock:/var/run/docker.sock maven mvn -f $PWD/pom15.xml clean verify```

## Demonstrate Failure
```docker run -v $PWD:$PWD -v /var/run/docker.sock:/var/run/docker.sock maven mvn -f $PWD/pom16.xml clean verify```