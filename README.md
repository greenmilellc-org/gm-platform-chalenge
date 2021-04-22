# gm-platform-challenge

> Technical Challenge Support Application

## Requirements

- Java 8

## Build

```sh
./gradlew clean build
```

## Run

```sh
java -jar /build/libs/gm-platform-challenge-0.0.1-SNAPSHOT.jar
```

## Endpoints

> The application runs on port 8080

`/actuator/info`: Exposes general application information

```json
{
  "build": {
    "version": "0.0.1-SNAPSHOT",
    "artifact": "gm-platform-challenge",
    "name": "gm-platform-challenge",
    "group": "com.greenmile",
    "time": "2021-02-25T23:45:57.156Z"
  }
}
```

`/actuator/health`: Exposes application health

```json
{
  "status": "UP"
}
```

`/actuator/prometheus`: Exposes application metrics in prometheus format

```text
# HELP jvm_classes_loaded_classes The number of classes that are currently loaded in the Java virtual machine
# TYPE jvm_classes_loaded_classes gauge
jvm_classes_loaded_classes{app_version="0.0.1-SNAPSHOT",application="gm-platform-challenge",} 8260.0
# HELP process_files_max_files The maximum file descriptor count
# TYPE process_files_max_files gauge
process_files_max_files{app_version="0.0.1-SNAPSHOT",application="gm-platform-challenge",} 10240.0
# HELP jvm_memory_max_bytes The maximum amount of memory in bytes that can be used for memory management
# TYPE jvm_memory_max_bytes gauge
jvm_memory_max_bytes{app_version="0.0.1-SNAPSHOT",application="gm-platform-challenge",area="heap",id="PS Survivor Space",} 1.572864E7
.
.
.
```
## Chalenge

* Fork the project to your personal account.
* Define and develop a CI / CD pipeline for that application.
* The final artifact in the BUILD process must be a docker image.
* The application must be deployed to the cloud provider of your choice (ex: AWS / AZURE / GCP)
* Add monitoring for the application, the tool is of your choice.
* Diagram the entire architecture developed, from the CI / CD stage to the necessary infrastructure for its provisioning.

### Extras

* The definition of the entire infrastructure must be done using Terraform
* Use Ansible to configure what you think is necessary for your use.
* In addition to CI / CD, add the Continuous Deployment step
