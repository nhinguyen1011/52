public class TestSt {
    public static void main(String[] args) {
        Student student = new Student();
        student.Display();
        StudentManagement studentManagement=new StudentManagement();
        int svpass= studentManagement.Cpass();
        System.out.println("student pass: "+svpass);
        Student maxstudent = studentManagement.Sinhviendiemcao();
        System.out.println("student has gpa max in class: ");
        maxstudent.display();
        Student minstudent = studentManagement.Sinhviendiemthap();
        System.out.println("student has gpa min in class: ");
        minstudent.display();
    }
}
