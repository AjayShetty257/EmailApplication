package studentdatabaseapp;

import java.util.Scanner;

public class student {
    private String firstName;
    private String lastName;
    private  String gradeYear;
    private String studentID;
    private String courses;
    private int tutionbalance;
    private int costOfcourse=600;
    private static int id=1001;

    //constructor prompts user to enter student name and year
    public student(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter sytudent first name");
        this.firstName=in.nextLine();

        System.out.println("Enter student last name");
        this.lastName=in.nextLine();

        System.out.println("Enter student class level");
        this.gradeYear=in.nextLine();

        setID();
        System.out.println(firstName+lastName+studentID);
    }

    //Generate an ID
    private String setID(){
        id++;
        //Grade level+id
        this.studentID= gradeYear+""+id;
        return studentID;
    }

    //Enroll in courses
    public void enroll(){
        //gets inside a loop user hits 0
        do {
            System.out.println("enter couse to enroll(Q to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "/n" + course;
                tutionbalance = tutionbalance + costOfcourse;
            }
            else{break;}
        }while (1!=0);

        System.out.println("Enrolled in :"+courses);
        System.out.println("Tution Balance :"+tutionbalance);

    }
    //view balance
    public void viewBalance(){
        System.out.println("your balance is :"+tutionbalance);
    }
    //pay tution
    public void payTution(){
        System.out.println("Enter your payment");
        Scanner in =new Scanner(System.in);
        int payment=in.nextInt();
        tutionbalance=tutionbalance-payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();
    }
    //show status
    public String showInfo(){
        return "Name"+firstName+" "+lastName+"/ncourses enrolled"+courses+"view balance"+tutionbalance;
    }

    public int addStudentPercentage() {
        return 100;
    }
}
