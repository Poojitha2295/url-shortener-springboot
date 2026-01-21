## URL Shortener Application (Spring Boot)
A backend RESTful URL Shortener application built using Spring Boot that converts long URLs into short URLs and redirects users to the original URL when accessed.
## Features
Generate short URLs for long URLs
Redirect short URL to original URL
REST API based architecture
In-memory H2 database
Clean layered architecture (Controller, Service, Repository)
Exception handling & validation
GitHub version control
## Tech Stack
Java 17
Spring Boot
Spring Data JPA
H2 Database
Maven
Postman
Git & GitHub
## Project Structure
com.poojitha.urlshortener
 ├── controller
 ├── service
 ├── repository
 ├── entity
 └── UrlShortenerApplication.java
##  API Endpoints
Create Short URL
POST /api/shorten
Request Param
originalUrl=https://example.com
Redirect to Original URL
GET /{shortUrl}
## Testing
Tested using Postman
Verified redirection functionality in browser
## How to Run
mvn spring-boot:run
Application runs on:
http://localhost:9090
## Author
POOJITHA PONNALA

http://localhost:8080
👩‍💻 Author
Poojitha Ponnala
