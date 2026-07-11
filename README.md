# 🛒 Order Management System

A RESTful Order Management System built with **Spring Boot** that performs complete **CRUD (Create, Read, Update, Delete)** operations on orders. This project uses an **H2 in-memory database** for data storage and follows a layered architecture using Spring Boot best practices.

---

## 🚀 Features

- ➕ Create a new order
- 📋 View all orders
- 🔍 View an order by ID
- ✏️ Update an existing order
- 🗑️ Delete an order
- 💾 H2 In-Memory Database
- 🌐 RESTful APIs
- ⚡ Spring Data JPA for database operations
- 🧩 Lombok for reducing boilerplate code

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Maven
- Postman (API Testing)

---

## 📁 Project Structure

```
OrderManagementSystem
│
├── controller
│   └── OrderController.java
│
├── entity
│   └── Order.java
│
├── repository
│   └── OrderRepository.java
│
├── service
│   └── OrderService.java
│
├── resources
│   ├── application.properties
│   └── data.sql
│
└── OrderManagementSystemApplication.java
```

---

## 📌 Order Entity

| Field | Type |
|--------|------|
| id | Integer |
| productName | String |
| quantity | Integer |
| price | Double |

---

## 🔗 REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/orders` | Retrieve all orders |
| GET | `/orders/{id}` | Retrieve an order by ID |
| POST | `/orders` | Create a new order |
| PUT | `/orders/{id}` | Update an existing order |
| DELETE | `/orders/{id}` | Delete an order |

---

## 📥 Sample Request (POST /orders)

```json
{
  "productName": "Laptop",
  "quantity": 2,
  "price": 55000
}
```

---

## 📤 Sample Response

```json
{
  "id": 1,
  "productName": "Laptop",
  "quantity": 2,
  "price": 55000
}
```

---

## ▶️ How to Run

1. Clone the repository

```bash
git clone https://github.com/<your-username>/OrderManagementSystem.git
```

2. Open the project in IntelliJ IDEA.

3. Build the project using Maven.

4. Run:

```
OrderManagementSystemApplication.java
```

5. Open your browser or Postman:

```
http://localhost:8080/orders
```

---

## 🗄️ Database

This project uses the **H2 In-Memory Database**.

The database is created automatically when the application starts.

Sample data is loaded from `data.sql`.

---

## 🧪 Testing

The REST APIs can be tested using:

- Postman
- Browser (GET requests)

---

## 📷 Example Output

```
GET http://localhost:8080/orders
```

Returns

```json
[
  {
    "id": 1,
    "productName": "Laptop",
    "quantity": 2,
    "price": 55000.0
  },
  {
    "id": 2,
    "productName": "Mobile",
    "quantity": 5,
    "price": 18000.0
  }
]
```

---

## 🎯 Learning Outcomes

- Spring Boot REST API Development
- CRUD Operations
- Spring Data JPA
- Entity Mapping
- H2 Database Integration
- Layered Architecture
- API Testing with Postman

---

## 🔮 Future Enhancements

- DTO Pattern
- Exception Handling
- Validation
- MySQL Integration
- Swagger/OpenAPI Documentation
- Spring Security
- API-to-API Communication using RestTemplate/WebClient

---

## 👨‍💻 Author

**Harish Kumar P**

GitHub: https://github.com/<your-username>

---

