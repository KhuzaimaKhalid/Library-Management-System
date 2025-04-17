# 📚 Library Management System

This is a simple **Library Management System** written in Java, using basic object-oriented programming (OOP) concepts such as classes, objects, arrays, encapsulation, and user input handling via `Scanner`.

## 🚀 Features

- Store book details such as **Book ID**, **Title**, **Author**, and **Availability**
- Add a new book through user input
- Display all current book records
- Update availability status of a book
- Remove a book record
- Show updated book list after operations

## 🧱 Class Structure

### `Book` Class

- Fields:
  - `bookid` (String)
  - `title` (String)
  - `author` (String)
  - `availability` (boolean)

- Methods:
  - `updateAvailability(boolean status)`
  - `removeBook()`
  - `displayBookInfo()`
  - Getters and Setters for all fields

### `Library` Class (Main)

Handles:
- Initializing and storing books
- Taking input from the user
- Calling appropriate methods to manage the book collection

## 🛠️ How It Works

1. **Two books** are hardcoded and stored initially.
2. The user is prompted to **add a third book**.
3. All book records are then **displayed**.
4. The user is given the option to:
   - **Update** a book’s availability using the book ID.
   - **Remove** a book record by entering its book ID.
5. Final updated list of books is **displayed again**.

## 🧪 Sample Output

```bash
********************    Enter new book details  ***********************
Book ID: B103
Title: The Alchemist
Author: Paulo Coelho
Is Available (true/false): true

--- Book Records ---
===================================================================================
Book ID    : B101
Title      : 1984
Author     : George Orwell
Available  : true
===================================================================================
Book ID    : B102
Title      : To Kill a Mockingbird
Author     : Harper Lee
Available  : true
===================================================================================
Book ID    : B103
Title      : The Alchemist
Author     : Paulo Coelho
Available  : true
===================================================================================

Enter Book ID to update availability: B103
Enter new availability status (true/false): false
Availability updated for book B103 to false

Enter Book ID to remove: B101
Book record removed.

--- Updated Book Records ---
Record not found. Book has been removed.
===================================================================================
Book ID    : B102
Title      : To Kill a Mockingbird
Author     : Harper Lee
Available  : true
===================================================================================
Book ID    : B103
Title      : The Alchemist
Author     : Paulo Coelho
Available  : false
===================================================================================
