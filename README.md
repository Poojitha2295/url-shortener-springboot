# 🚀 URL Shortener - Spring Boot

A simple and efficient URL Shortener service built using Spring Boot. This project converts long URLs into short, shareable links and redirects users to the original URL.

---

## 📌 Features

- 🔗 Convert long URLs into short URLs
- 🔄 Redirect short URL to original URL
- ⚡ RESTful API architecture
- 🧩 Clean layered structure (Controller → Service)
- 🚫 No authentication (public API for simplicity)

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Web (REST APIs)
- Maven

---

## 📂 Project Structure

src/main/java/com/example/urlshortener

├── controller        # Handles HTTP requests (REST APIs)  
├── service           # Business logic layer  
├── dto               # Request/Response models  
└── UrlShortenerApplication.java  

---

## 🌐 API Endpoints

### 1️⃣ Create Short URL

POST /api/shorten

Request:
{
  "longUrl": "https://www.google.com"
}

Response:
abc123

---

### 2️⃣ Redirect to Original URL

GET /api/{shortUrl}

Example:
GET /api/abc123

Redirects to:
https://www.google.com

---

## ▶️ How to Run Locally

1. Clone repository  
git clone https://github.com/Poojitha2295/url-shortener-springboot.git  

2. Go to project folder  
cd url-shortener-springboot  

3. Build project  
mvn clean install  

4. Run application  
mvn spring-boot:run  

---

## ☁️ Deployment

This project can be deployed using:
- Railway  
- Render  
- AWS EC2  
- Heroku  

---

## 📈 Future Improvements

- Add PostgreSQL/MySQL database  
- Add click analytics tracking  
- Add expiry time for URLs  
- Add custom alias support  
- Add JWT authentication (advanced version)

---

## 👩‍💻 Author

Poojitha Ponnala  
GitHub: https://github.com/Poojitha2295/url-shortener-springboot  
---
## 🔐 Authentication (Optional / Removed)
JWT authentication was initially implemented to secure APIs. However, it was later removed to simplify deployment and ensure stable functionality of the URL shortener service.
Future versions may include full JWT-based authentication for user-specific URL management.
