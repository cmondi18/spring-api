Spring boot api + auth + logging
================================

This is a sample project on spring boot with API + Basic Auth + Logging

The API get your IP from another resource, add new json data and return it to you.

**You can checkout and run it locally with a few minutes.**

### How to run with Gradle

Type from command line for running tests:

```
./gradlew bootRun
```

### How to work with this project
Test user info:
```
login: user
password: password
```
1) You can use your browser and go to http://localhost:8080/api/hello
2) Use some tool to work with API's (like Postman for example)
3) Or just print it on your terminal: `curl --user user:password http://localhost:8080/api/hello`
