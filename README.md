# Offers app

This app is built on Spring boot.

### Start the app locally

Install Java 17 or above and run:

```
./mvnw spring-boot:run
```

### Test the get_offer api

```
curl --location --request GET 'localhost:8081/get_offer?salaryPerYear=3500000&creditCards=1&loans=0'
```

Parameters for get_offer api:

- salary - salary of the user in lakhs.
- creditCards - No. of credit cards the user has.
- loans - No. of loans user has.
