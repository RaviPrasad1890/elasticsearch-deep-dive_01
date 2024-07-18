# YouTube Reference
https://www.youtube.com/watch?v=IiZZAu2Qtp0&list=PLXy8DQl3058OoJqGLFdqoBkBKm2T0kS9B

# To Launch Application
Step1: Download Elasticsearch

Step2: Open terminal, run bin/elasticsearch

Step3: When we run for the first time, we will get userid, password, and caFingerprint

Step4: Set them in application.properties file


# Curl

curl --location 'http://localhost:8080/api/person' \
--header 'Content-Type: application/json' \
--data '{
"id":"1",
"name":"Ravi"
}'

curl --location --request GET 'http://localhost:8080/api/person/1' \
--header 'Content-Type: application/json' \
--data '{
"id":"1",
"name":"Ravi"
}'