package nhi;

public class Student {

    private String name;
    private float gpa;

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public boolean check(){

        if (gpa >= 1.5) {
            return true;
        } else {
            return  false;
        }

    }
    public void printf(){
        System.out.println("student: "+name+"gpa: "+gpa);
    }


}
