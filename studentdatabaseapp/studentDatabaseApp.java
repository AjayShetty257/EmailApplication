package studentdatabaseapp;

import java.util.Scanner;

public class studentDatabaseApp {
    public static void main(String[] args){
        student s1=new student();
        s1.enroll();
        s1.payTution();
        System.out.println(s1.showInfo());
        System.out.println(s1.addStudentPercentage());
        //ask how many students we want to add
        System.out.println("Enter number of students you want to enroll");
        Scanner in=new Scanner(System.in);
        int numberOfStudents=in.nextInt();
        student[] students=new student[numberOfStudents];

        //create n number of new students
        for (int n=0;n<numberOfStudents;n++){
            students[n]=new student();
            students[n].enroll();
            students[n].payTution();
            System.out.println(students[n].showInfo());

        }

    }
}
