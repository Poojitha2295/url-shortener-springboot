🔗 URL Shortener Application (Spring Boot)

🚀 Overview

A backend application that converts long URLs into short links and redirects users efficiently.
Enhanced with JWT-based authentication to secure APIs and simulate real-world backend systems.



✨ Features

- 🔗 Shorten long URLs
- 🔁 Redirect to original URL
- 👤 User Registration & Login
- 🔐 JWT Authentication & Authorization
- 🛡️ Secured APIs using token
- ⚡ RESTful API design


🛠️ Tech Stack

- Backend: Spring Boot
- Language: Java
- Database: H2 Database
- Security: Spring Security + JWT
- API Testing: Postman


🔐 Authentication

- Implemented JWT (JSON Web Token) for secure API access
- Stateless authentication (no sessions stored)
- Token passed in headers:

Authorization: Bearer <your_token>


📌 API Endpoints

🔹 Auth APIs

- "POST /auth/register" → Register new user
- "POST /auth/login" → Login & get JWT token

🔹 URL APIs

- "POST /shorten" → Generate short URL
- "GET /{shortUrl}" → Redirect to original URL

🔹 Secure API

- "GET /auth/secure" → Access only with token


▶️ How to Run

1. Clone the repository

git clone https://github.com/your-username/url-shortener.git

2. Open in IDE (Eclipse/IntelliJ)

3. Run Spring Boot application

4. Test APIs using Postman


🧪 Sample Request

Register

{
  "username": "poojitha",
  "password": "1234"
}



📈 Future Enhancements

- 🔐 Password encryption (BCrypt)
- 📊 Click analytics
- 🗄️ MySQL integration
- 👥 Role-based access


## Author:
Ponnala Poojitha  

