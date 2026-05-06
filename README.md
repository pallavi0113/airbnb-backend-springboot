# Airbnb Backend Clone

A scalable backend application inspired by Airbnb, built using Spring Boot.

---

## 🚀 Tech Stack

- Java
- Spring Boot
- Spring Security
- JWT Authentication
- Hibernate
- Spring Data JPA
- MySQL
- Maven
- Swagger UI

---

## ✨ Features

- User Registration & Login
- JWT Authentication
- Role-based Authorization
- Property Listing APIs
- Booking APIs
- Secure REST APIs
- Exception Handling
- Validation


---

## 🧠 Architecture

- Controller Layer
- Service Layer
- Repository Layer
- DTO Pattern
- Entity Relationship Mapping

---

## 📚 What I Learned

- JWT Authentication
- Spring Security Configuration
- REST API Development
- Layered Architecture
- Hibernate ORM
- Exception Handling
- DTO Mapping
- Database Relationships

---

## 📷 Swagger API Documentation
<img width="1763" height="4567" alt="Swagger-api" src="https://github.com/user-attachments/assets/9341568c-c8e7-486c-a867-ecf1f451c668" />

---

## 📂 Project Structure

```text
src/main/java/com.pallavi.project.AirBnb
 ┣ advice
 ┣ config
 ┣ controller
 ┣ dto
 ┣ entity
 ┣ exception
 ┣ repository
 ┣ security
 ┣ service
 ┣ strategy
 ┣ util
```

- **Advice** → Global exception & response handling  
- **Config** → Application configurations  
- **Controller** → Handles REST API requests  
- **DTO** → Request & Response objects  
- **Entity** → Database entities  
- **Exception** → Custom exceptions  
- **Repository** → Database interaction layer  
- **Security** → JWT & Spring Security configuration  
- **Service** → Business logic layer  
- **Strategy** → Strategy pattern implementations  
- **Util** → Utility/helper classes

---

## 🔐 Authentication Flow

```text
User Login
   ↓
JWT Token Generated
   ↓
Token Sent in Authorization Header
   ↓
Protected APIs Accessible
```

- User logs in using email & password  
- Server validates credentials  
- JWT token is generated  
- Token is used to access secured APIs

---

## 📌 Important API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/auth/signup` | Register a new user |
| POST | `/auth/login` | User login |
| POST | `/auth/refresh` | Refresh JWT token |
| GET | `/users/profile` | Get user profile |
| PATCH | `/users/profile` | Update profile |
| GET | `/hotels/search` | Search hotels |
| POST | `/bookings/init` | Initialize booking |
| POST | `/bookings/{bookingId}/cancel` | Cancel booking |
| GET | `/bookings/{bookingId}/status` | Check booking status |
| POST | `/admin/hotels` | Create hotel |
| GET | `/admin/hotels` | Get admin hotels |

---

## 🚀 Future Improvements

- Docker containerization  
- AWS deployment  
- Redis caching  
- Payment gateway integration  
- Email notifications  
- Microservices architecture  
- CI/CD pipeline integration
