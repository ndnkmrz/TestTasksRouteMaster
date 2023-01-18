# Task 3.1
Explain what the error in the config is?

## Answer
This is Swagger specification. 
Response code must be in quotes, probably. At least, I see it in the documentation.
Also, 405 response is Method Not Allowed, for Invalid input it is better to use 422 Unprocessable Entity

# Task 3.2 
Explain what the correct HTTP response code for each request would be and why?

## Answer
Request1:
- user: admin
- method: GET object

- response: 200 OK
- why: user exists, have rights to do this

Request2:
- user: user0
- method: POST object
- response: 405 Method Not Allowed
- why: user exists, have no rights

Request3:
- user: user2
- method: PUT object
- response: 401 Unathorized
- why: user not exists