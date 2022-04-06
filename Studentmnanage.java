package nhi;

import java.util.Scanner;

public class Studentmnanage {
    private int n;
    private Student[] students;

    public Studentmnanage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter student: ");
        int n = scanner.nextInt();
        students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter name of student" + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.println("enter gpa of student" + (i + 1) + ": ");
            float gpa = scanner.nextFloat();
            students[i] = new Student();
            students[i].setName(name);
            students[i].setGpa(gpa);
        }
    }

    public int countpass() {
        int count = 0;
        for (Student st : students) {
            boolean gpacheck = st.check();
            if (gpacheck == true) {
                count++;
            }
            return count;
        }
        return count;
    }

    public Student findmax() {
        Student max = students[0];
        for (Student st : students) {
            if (st.getGpa() == max.getGpa()) {
                max = st;
            }

        }
        return max;
    }
    public Student findmin() {
        Student min = students[0];
        for (Student st : students) {
            if (st.getGpa() == min.getGpa()) {
                min = st;
            }

        }
        return min;
    }
}



