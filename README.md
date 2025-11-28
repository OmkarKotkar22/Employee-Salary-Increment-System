<h1 align="center">
  💰 Employee Salary Increment System (Java OOP)
</h1>

<p align="center">
  A Java console application demonstrating **Object-Oriented Programming (OOP)** principles by calculating and applying a salary increment to an employee's record, ensuring clear separation of data and calculation logic.
</p>

---

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-007396?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/Concept-Encapsulation%20%26%20Method%20Invocation-4169E1?style=for-the-badge" />
  <img src="https://img.shields.io/badge/repo%20size-6%20KB-32CD32?style=for-the-badge" /> 
  <img src="https://img.shields.io/badge/Last%20Commit-28/ %2011/ 2025%20-FF69B4?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Type-Console%20Application-8A2BE2?style=for-the-badge" />
</p>

---

## 📌 **Key Features & OOP Concepts**

### **1. Employee Data Model**
* The **`Employee.java`** class serves as the Plain Old Java Object (POJO), holding employee attributes like ID, name, and current salary.

### **2. Calculation and Logic Separation**
* The **`Employee_Salary.java`** file contains the main application logic, which instantiates the `Employee` object, accepts the increment percentage, and calls a method (likely within `Employee.java`) to perform the update.

### **3. Encapsulation**
* Demonstrates encapsulation by protecting sensitive salary data and controlling its modification via specific methods.

### **4. Simple Calculation**
* Performs a straightforward percentage-based salary increase and displays the updated salary to the console.

---

## 🛠 Tech Stack

### 💻 Core Technology
- <img src="https://img.icons8.com/color/30/java-coffee-cup-logo--v1.png" width="22" /> **Java** (JDK 8+)
- **OOP** (Object-Oriented Programming)

### 🧱 Architecture
- **Console Application** structure.

---

## 📂 **Project Folder Structure**

<p align="center">
  <img src="https://img.shields.io/badge/Structure-Standard%20Java%20Package-90EE90?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Package-src%2FSalary-FFA07A?style=for-the-badge" />
</p>

The project uses a standard Java structure, with the source code residing in the `src/Salary/` package.

| File Name | Description | Role |
| :--- | :--- | :--- |
| `Employee.java` | Defines the employee data model (POJO). | **Data Model** 👤 |
| `Employee_Salary.java` | Main file containing the `main` method and logic for running the increment calculation. | **Driver/Main Logic** ⚙️ |

---  
Employee-Salary-Increment-System/  
│  
├── bin/  
│   └── Salary/  
│       ├── Employee.class  
│       └── Employee_Salary.class  
│  
├── src/  
│   └── Salary/  
│       ├── Employee.java  
│       └── Employee_Salary.java  
│  
├── .classpath  
└── .project    

---

## ⚙️ **Installation and Setup**

To run this project locally, you need a Java Development Kit (JDK) installed on your system.

### **1. Clone the repository**
```bash
git clone [Your Repository URL]
```

### **2. Navigate to the source directory**
```
cd Employee-Salary-Increment-System/src/Salary
```

### **3. Compile the Java files**
```Bash
javac *.java
```
### **4. Execute the main application class**
```Bash
java Salary.Employee_Salary
```
