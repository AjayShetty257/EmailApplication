package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    int mailBoxCapacity;
    private String password;
    private int defaultPasswordLength=8;
    private String alternateEmail;
    private String email;
    private String company="wipro.com";


    //Constructor to receive the first name and last name
    public Email(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED :" + this.firstName + " " + this.lastName);
        //call a method asking for the department-return department
        this.department=setDepartment();
        System.out.println("Department"+this.department);
        //call a method that return a random password
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("your password is"+this.password);
        email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+company;
        System.out.println("your email is : "+email);

    }
//Ask for the department
    private String setDepartment(){
        System.out.println("Enter the department\n1 for sales\n2 for department\n3 for accounting\n0 for none\n enter department code :");
        Scanner in=new Scanner(System.in);
        int depChoice=in.nextInt();
        if (depChoice==1){
            return "sales";
        }
        else if(depChoice == 2){
            return "dev";
        }
        else if (depChoice == 3){
            return "accounting";
        }
        else{
            return "";
        }
    }
//Generate a random password
     private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@$!^";
        char[] password=new char[length];
        for (int i=0;i<length;i++){
            int rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);

        }
        return new String(password);
    }
//Set the mail box capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity=capacity;
    }
//Set the alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail=alternateEmail;
    }
//Change the password
    public void changepassword(String password){
        this.password=password;
    }
    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }

}
