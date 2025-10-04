# Inventory Management System - Backend

This is the **backend** for the Inventory Management System project built with **Java**, **Spring Boot**, **MySQL**, and **Maven**. It provides REST APIs for managing users, products, categories, suppliers, and transactions.

---

## Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- User authentication with JWT
- Role-based access control (Admin/User)
- CRUD operations for:
  - Users
  - Products
  - Categories
  - Suppliers
  - Transactions
- MySQL database integration
- Exception handling & validation

---

## Tech Stack

- **Backend:** Java 21, Spring Boot 3.5.5
- **Database:** MySQL 8
- **Build Tool:** Maven
- **Security:** Spring Security, JWT
- **Testing:** JUnit, Mockito

---

## Getting Started

### Prerequisites

- Java 21
- Maven
- MySQL

### Setup

1. Clone the repository:

```bash
git clone https://github.com/SaiSindhuSubbisetty/Inventory-Management-System-Backend.git
cd InventoryManagementSystem
````

2. Update the database configuration in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

3. Build and run the application:

```bash
./mvnw clean package
java -jar target/InventoryManagementSystem-0.0.1-SNAPSHOT.jar
```

The backend server will start at: `http://localhost:5050`

---

## API Endpoints

### Auth

* `POST /api/auth/register` - Register a new user
* `POST /api/auth/login` - Login and get JWT token

### Users

* `GET /api/users` - Get all users
* `GET /api/users/{id}` - Get user by ID
* `POST /api/users` - Create a user
* `PUT /api/users/{id}` - Update user
* `DELETE /api/users/{id}` - Delete user

*(Similar endpoints exist for Products, Categories, Suppliers, Transactions)*

---

## Project Structure

```
src
 └── main
     ├── java/com/Sindev/InventoryManagementSystem
     │    ├── controllers
     │    ├── dtos
     │    ├── enums
     │    ├── exceptions
     │    ├── models
     │    ├── repositories
     │    ├── security
     │    └── services
     └── resources
          └── application.properties
```

---

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

---

## License

This project is licensed under the MIT License.

```
