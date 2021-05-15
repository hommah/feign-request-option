## Overview
Check how we can use Request.Options for feign client to pass different timeout settings 
per method.

## How to run the application
execute following command.
```
./gradlew bootRun
```

## How to test
execute following curl command.
When you just want to call `https://www.google.com`. 
```
curl http://localhost:8080/request-google
```

When you want see timeout exception to check that we can pass different timeout settings dynamically. 
```
curl http://localhost:8080/request-google-with-options?readTimeOut=1
```

You would see `java.net.SocketTimeoutException: Read timed out` on your console. 
