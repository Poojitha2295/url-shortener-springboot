# URL Shortener – Spring Boot Application

This is a full-stack URL Shortener application built using Spring Boot that allows users to convert long URLs into short URLs and redirect to the original website when the short URL is accessed. The backend is implemented using REST APIs in Spring Boot, where a POST request generates a unique short code and stores the mapping in an H2 database using Spring Data JPA, and a GET request handles redirection using HTTP status codes. The application follows a clean layered architecture with controller, service, repository, and entity layers to ensure maintainability and scalability. To make the application usable for non-technical users, a simple HTML-based user interface is added and served by Spring Boot, where users can paste a long URL, click a button, and instantly receive a short URL without using Postman or knowing HTTP methods. All APIs were tested using Postman during development, and the application runs on port 8080. The project is version controlled using Git and GitHub and deployed on Render with a public live URL, making it suitable for real-world usage and product-based company interviews.

## Tech Stack:
Java 17, Spring Boot, Spring Data JPA, H2 Database, Maven, REST APIs, HTML, Git, GitHub, Postman

## Live Demo:
https://url-shortener-springboot.onrender.com

## Author:
Ponnala Poojitha  

