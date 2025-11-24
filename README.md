# BookStore-Backend

This project is a RESTful API for managing a bookstore, built with modern Java and Spring Boot following clean architecture principles.

It showcases standard layered architecture:

Controller → Service → Repository → Database


## 🧱 Architecture Overview

This project follows a classical and maintainable layered structure:

### Controller Layer
Handles REST HTTP requests and responses. Validates input and delegates to Services.

### Service Layer
Contains business logic following SOLID principles. Uses Repositories to access data.

### Repository Layer
Defines data persistence operations using Spring Data JPA.

### Entity Layer
JPA entities mapped to the database.

### DTO Layer
Objects for API requests and responses. Keeps controllers decoupled from entities.

### Mapper Layer
Converts between entities and DTOs.

## ⚙️ Installation & Setup
### ✔ Prerequisites

Make sure you have installed:

- Java	21

- Maven	3.9.11

### Check versions:

> java -version

> mvn -version

## 📦 How to Run the Project
### 1️⃣ Clone the repository
> git clone \<this repository url\>

> cd BookStore-Backend

### 2️⃣ Build the project
> mvn clean install

### 3️⃣ Run the application
> mvn spring-boot:run

Or run the generated JAR:

> mvn package

> java -jar \<path to JAR file\>

## 🗄 Database

This project uses H2 in-memory database (no installation required).

Access the H2 web console:

http://localhost:8080/h2-console


Default JDBC URL (already preconfigured):

jdbc:h2:mem:testdb

## 🚀 API Endpoints
| Method | Endpoint |	Description
| :------ | :----: | ----: |
POST   | /api/books	    | Create a new book
GET	   | /api/books	    | List all books
GET	   | /api/books/{id}	| Get book by ID
PUT	   | /api/books/{id}	| Update book
DELETE | /api/books/{id}	| Delete book