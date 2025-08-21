# 📚 Pahana-Edu Online Billing System

> A secure, efficient, and user-friendly billing management system for **Pahana Edu Bookshop**, built with **Java EE**, **React.js**, and **MySQL**.  
> Designed to replace manual billing with a modern, scalable, and maintainable solution.

---

## ✨ Features

- 🔑 **JWT-based Authentication** (secure login & role management)  
- 👥 **User Management** (Admin & Staff roles)  
- 🧾 **Customer Management** (add, update, delete, search)  
- 📦 **Item Management** (inventory tracking, unit price, quantity)  
- 💳 **Billing System** (create bills, calculate totals)  
- 📊 **Reports & Analytics** (real-time updates and retrievals)  
- 🛡 **Data Security** (password hashing, validation, error handling)  
- ✅ **Testing Coverage** (JUnit + Postman API tests)  
- 🎨 **Responsive UI** (React + Bootstrap frontend)  

---

## 🏗 System Architecture

The system follows a **3-tier architecture**:

1. **Frontend (React.js)**  
   - Responsive UI with forms and validation  
   - REST API communication with backend  
   - Styled using **Bootstrap**

2. **Backend (Java EE)**  
   - REST endpoints using Servlets & Controllers  
   - **Service Layer** handles business logic  
   - **DAO Layer** for database access  
   - Secure authentication with **JWT**

3. **Database (MySQL)**  
   - Normalized schema with relationships  
   - Tables: `users`, `customers`, `items`, `bills`, `otp`  
   - Indexed foreign keys for efficiency  

---

## 🗄 Database Schema

- **Users** → Login credentials, roles (admin/staff), emails  
- **Customers** → Account number, contact details  
- **Items** → Inventory details (name, description, price, stock)  
- **Bills** → Customer reference, bill date, total amount  
- **OTP** → For password recovery / 2FA  

---

## ⚙️ Tech Stack

- **Backend**: Java EE (Servlets, Services, DAO)  
- **Frontend**: React.js + Bootstrap  
- **Database**: MySQL  
- **Security**: JWT, password hashing (SHA-256/BCrypt)  
- **Testing**: JUnit 5, Mockito, Postman  
- **Build Tool**: Maven (with wrapper)  
- **Version Control**: Git + GitHub  

---

## 🚀 Getting Started

### ✅ Prerequisites
- Java JDK 11+  
- Node.js & npm (for React frontend)  
- MySQL Server  
- Maven (or use included wrapper `./mvnw`)  

### 🔧 Installation & Setup

```bash
# Clone backend
git clone https://github.com/nimesh-2000/Pahana-Edu-
cd Pahana-Edu-
./mvnw clean install
./mvnw spring-boot:run
