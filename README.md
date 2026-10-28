# school-Management-java
# School Management System (Java)

A console-based school system built with Java. A teacher logs in, registers students, records marks, and filters students by subject or registration number.

## Features
- Teacher login with password check
- Register multiple students (name, age, gender, registration number, class, subject, marks)
- Record marks for a registered student
- View all registered students
- Filter students by subject or registration number
- Input handling for invalid menu choices

## Built with
- Java
- Object-oriented programming: classes, an interface (`Activities`), and `ArrayList`
- IntelliJ IDEA

## Project structure
- `Activities.java`: interface listing the teacher's actions
- `Teacher.java`: implements the actions
- `Student.java`: holds student details
- `School.java`: contains `main` and runs the program

## How to run
1. Clone this repository:
   ```
   git clone https://github.com/mercyj-ai/school-Management-java.git
   ```
2. Open the folder in IntelliJ IDEA.
3. Run `School.java`.
4. Log in with the practice password `12345`.

## What I'm learning
- Using interfaces and implementing them in a class
- Storing objects in an `ArrayList`
- Reading console input with `Scanner`
- Finding and fixing bugs in my own code

## Future improvements
- Save students to a file or database
- Add input validation for numbers
- Build a graphical interface
