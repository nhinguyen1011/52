package nhi;

public class Bai52 {
    public static void main(String[] args) {
        Student student = new Student();
        boolean checkgpa = student.check();
        if (checkgpa == true) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        Studentmnanage studentmnanage=new Studentmnanage();
        int svpass= studentmnanage.countpass();
        System.out.println("student pass: "+svpass);
        Student maxstudent=studentmnanage.findmax();
        System.out.println("student has gpa max in class: ");
        maxstudent.printf();
        Student minstudent=studentmnanage.findmin();
        System.out.println("student has gpa min in class: ");
        minstudent.printf();
    }


}
