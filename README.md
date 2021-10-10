# Getting Started

### Running locally
Run `./gradlew bootRun`

Then access `http://localhost:8080` (you will be redirected to swagger ui)

Or use curl `curl http://localhost:8080/github/{user}/{repository}`

For instance: `curl http://localhost:8080/github/spring-projects/spring-framework`

### Run using docker
`./gradlew build && docker build -t trustly/demo . && docker run -p 8080:8080 trustly/demo`
