public class Student {
    private double gpa;
    private String name;

    public Student() {
        this.gpa = gpa;
        this.name = name;
    }

    public Student(double gpa) {
        this.gpa = gpa;
    }

    public Student(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("Ten: "+name+" diem: "+gpa);
    }
    public int Check(){
        if (gpa >= 1.5)
            return 1;
        else
            return 0;
    }
    public void Display(){
        if ( Check() == 1)
            System.out.println("pass");
        else
            System.out.println("fail");
    }
}
