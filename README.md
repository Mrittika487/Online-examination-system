# Online-examination-system
# 🎓 Online Examination System

## 📌 Project Overview

The Online Examination System is a professional web-based examination platform developed using Java Spring Boot and MySQL.  
It allows students to register, login securely, take MCQ-based exams, view results, download certificates, and access leaderboard rankings.

The system also includes an Admin Panel for management purposes.

---

# 🚀 Technologies Used

| Technology | Usage |
|------------|------|
| Java | Backend Development |
| Spring Boot | Main Framework |
| Spring Security | Authentication & Security |
| Spring Data JPA | Database Handling |
| Hibernate | ORM |
| MySQL | Database |
| Thymeleaf | Frontend Template Engine |
| Bootstrap 5 | Responsive UI |
| HTML/CSS | Frontend Design |
| JavaScript | Client-side Functionality |

---

# 📂 Project Structure

src
 └── main
      ├── java
      │
      │    └── com.example.exam
      │
      │          ├── OnlineExaminationSystemApplication.java
      │          ├── ExamController.java
      │          ├── SecurityConfig.java
      │          ├── CustomUserDetailsService.java
      │          ├── User.java
      │          ├── Student.java
      │          ├── UserRepository.java
      │          └── StudentRepository.java
      │
      └── resources
            │
            ├── application.properties
            │
            └── templates
                  │
                  ├── login.html
                  ├── register.html
                  ├── dashboard.html
                  ├── exam.html
                  ├── result.html
                  ├── leaderboard.html
                  ├── certificate.html
                  └── admin.html

---

# 📄 File Explanation

## 1️⃣ OnlineExaminationSystemApplication.java

### Purpose
Main Spring Boot starter class.

### Function
Starts the Spring Boot application server.

---

## 2️⃣ ExamController.java

### Purpose
Main controller of the project.

### Handles
- Login Page
- Dashboard
- Exam Page
- Result Page
- Registration
- Leaderboard
- Admin Panel
- Certificate Page
- Save Exam Result

### Important Mappings

| Mapping | Purpose |
|---------|---------|
| `/` | Login Page |
| `/dashboard` | Dashboard |
| `/exam` | Exam Page |
| `/result` | Result Page |
| `/register` | Student Registration |
| `/leaderboard` | Student Ranking |
| `/admin` | Admin Panel |
| `/certificate` | Certificate Page |

---

## 3️⃣ SecurityConfig.java

### Purpose
Handles Spring Security configuration.

### Features
- Login Authentication
- Page Authorization
- Role-based Access
- Logout Handling
- Protected URLs

### Roles
- ADMIN
- STUDENT

---

## 4️⃣ CustomUserDetailsService.java

### Purpose
Loads user details from MySQL database during login.

### Function
Checks:
- Email
- Password
- User Role

Used by Spring Security.

---

## 5️⃣ User.java

### Purpose
Entity class for users table.

### Stores
- User ID
- Name
- Email
- Password
- Role

### MySQL Table
users

---

## 6️⃣ Student.java

### Purpose
Entity class for exam result records.

### Stores
- Student Name
- Email
- Score

### MySQL Table
student

---

## 7️⃣ UserRepository.java

### Purpose
Database operations for users.

### Functions
- Find user by email
- Save new users

---

## 8️⃣ StudentRepository.java

### Purpose
Database operations for exam results.

### Functions
- Save score
- Fetch leaderboard data

---

# 📁 HTML Pages Explanation

## login.html

### Features
- Login Form
- Captcha Verification
- Register Button
- Admin Login Info

### Access URL
http://localhost:8080/

---

## register.html

### Features
- Student Registration
- Save User to MySQL
- Account Creation

### Access URL
http://localhost:8080/register

---

## dashboard.html

### Features
- Navigation Buttons
- Start Exam
- Leaderboard
- Admin Panel
- Logout

### Access URL
http://localhost:8080/dashboard

---

## exam.html

### Features
- MCQ Questions
- Random Questions
- Timer System
- Auto Submit
- Score Calculation

### Access URL
http://localhost:8080/exam

---

## result.html

### Features
- Score Display
- Percentage
- Pass/Fail Status

### Access URL
http://localhost:8080/result

---

## leaderboard.html

### Features
- Student Ranking
- Highest Scores
- Database Records

### Access URL
http://localhost:8080/leaderboard

---

## certificate.html

### Features
- Professional Certificate
- Student Name
- Score Display
- Print/Download Certificate

### Access URL
http://localhost:8080/certificate

---

## admin.html

### Features
- Admin Dashboard
- Leaderboard Access
- Student Management Navigation
- Dashboard Navigation

### Access URL
http://localhost:8080/admin

---

# 🛢 Database Setup

## Create Database

CREATE DATABASE examdb;

---

## Configure application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/examdb

spring.datasource.username=root

spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

---

# 👨‍💻 Admin Login

Email: admin@gmail.com

Password: admin123

---

# ▶ How To Run Project

## Step 1
Open project in VS Code / IntelliJ.

---

## Step 2
Open MySQL server.

---

## Step 3
Run command:

mvn clean install

---

## Step 4
Run application:

mvn spring-boot:run

---

## Step 5
Open browser:

http://localhost:8080/

---
# Showing in this order:
- Login Page
- Registration
- Student Login
- Dashboard
- Start Exam
- Timer Running
- Submit Exam
- Result Page
- Certificate
- Leaderboard
- MySQL Database Tables
- Admin Panel
---


# 🔮 Steps to show the Database in mySQL
- Open:
MySQL Workbench (Local instance MySQL80)
- Schemas
- examdb
- Tables
You will see:
users
student
- Right click:
users
- Then click:
Select Rows - Limit 1000

---

# 🔮 SQL Queries
Run these queries in SQL editor.
- Show All Students
SELECT * FROM student;

- Show Leaderboard
SELECT * FROM student
ORDER BY score DESC;

- Show Registered Users
SELECT * FROM users;

- Show Only Admin
SELECT * FROM users
WHERE role='ADMIN';

--- 



# 🌟 Features Implemented

✅ Student Registration  
✅ Login System  
✅ Spring Security  
✅ Captcha Verification  
✅ Dashboard  
✅ Online Exam  
✅ Timer + Auto Submit  
✅ Random Questions  
✅ Result System  
✅ Leaderboard  
✅ Certificate Generation  
✅ Admin Panel  
✅ Role Based Login  
✅ MySQL Database Integration  
✅ Responsive UI  

---

# 🔮 Future Improvements

- Questions from MySQL
- Add/Delete Questions
- Exam History
- Email Notifications
- Analytics Dashboard
- Charts & Reports
- Online Deployment

---


# 👨‍🎓 Author

Developed By:

Mrittika Das

B.Tech CSE Graduate

---

# 📜 License

This project is for educational and learning purposes.
