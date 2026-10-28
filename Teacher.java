import java.util.ArrayList;
import java.util.Scanner;
public class Teacher implements Activities{

    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String Name;
    String Password;

 @Override
public void logIn(){
    System.out.println("****System Log In *****");
    System.out.print("Enter your name: ");
    Name = scanner.nextLine();
    System.out.print("Enter your password: ");
    Password = scanner.nextLine();

    if(Password.equals("12345")){
        System.out.println("****You are logged in*****");
    }
    else{
        System.out.println("**** Failed to log in!!!!! *****");
        System.exit(0);
    }
}

    @Override
    public void registerStudents(){

        System.out.print("Enter the number of students you want to register: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < number; i++) {
            Student s = new Student();

                System.out.print("Enter students first name: ");
                s.FName = scanner.nextLine();

                System.out.print("Enter students last name: ");
                s.LName = scanner.nextLine();

                System.out.print("Enter students age: ");
                s.Age = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter students Gender: ");
                s.Gender = scanner.nextLine();

                System.out.print("Enter students registration Number: ");
                s.RegNo = scanner.nextLine();

                System.out.print("Enter students Marks: ");
                s.Marks = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter students Subject: ");
                s.Subject = scanner.nextLine();

                System.out.print("Enter students Class: ");
                s.Class = scanner.nextLine();

                students.add(s);

                System.out.println("**** Student " + s.FName + " " + s.LName + " " + " has been registered successfully***");

        }
    }

@Override
public void recordMarks(){
    System.out.print("Enter students registration number: ");
    String regNo = scanner.nextLine();

    for(Student student : students){
        if(student.RegNo.equals(regNo)){
            System.out.print("Enter students marks: ");
            student.Marks = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter students subject: ");
            student.Subject = scanner.nextLine();

            System.out.println(student.FName + " " + student.LName + " with registration number " + student.RegNo + " scored " + student.Marks + " in " + student.Subject);
            return;
        }
    }
    System.out.println("Student not found!");
}

    @Override
    public void viewRegisteredStudents(){
        for(Student s : students){
            System.out.println("First Name: " + s.FName + ", " +
                    "Last Name: " + s.LName + ", " +
                    "Age: " + s.Age + ", " +
                    "Gender: " + s.Gender + ", " +
                    "RegNO: " + s.RegNo + ", " +
                    "Class: " + s.Class + ", " +
                    "Marks: " + s.Marks + ", " +
                    "Subject: " + s.Subject);
        }
    }

    @Override
    public void filterStudents(){

        Student s = new Student();
        System.out.print("Enter your choice (1: filter by subject)(2: filter by regNo): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if(choice == 1){
            System.out.print("Enter subject name: ");
            s.Subject = scanner.nextLine();
            for(Student student : students){
                if(s.Subject.equals(student.Subject)){
                   
                }System.out.println("Found " + student.FName + " " + student.LName + " with registration number " + student.RegNo + " in " + student.Class);
            }
        }
       else if(choice == 2){
            System.out.print("Enter regNO: ");
            s.RegNo = scanner.nextLine();
            for(Student student : students){

                if(student.RegNo.equals(s.RegNo)){
                    System.out.println("Found " + student.FName + " " + student.LName + " with registration number " + student.RegNo + " in " + student.Class);
                }
            }

        }
        else{
            System.out.println("Invalid choice!!!!");
        }
    }
}
