public class School {
    static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.logIn();
        teacher.registerStudents();
        teacher.recordMarks();
        teacher.viewRegisteredStudents();
        teacher.filterStudents();
    }
}
