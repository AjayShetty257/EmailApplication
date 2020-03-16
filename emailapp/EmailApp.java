package emailapp;

public class EmailApp {
    public static void main (String[] args){


        Email em1 =new Email("ajay","shetty");
        //String password = em1.randomPassword(8);
        em1.setMailBoxCapacity(50);
        em1.setAlternateEmail("ajay@gmail.com");
        System.out.println("your password is"+em1.getPassword());
        System.out.println("your mail box capacity is"+em1.getMailBoxCapacity());
        System.out.println("Your alternate Email is"+em1.getAlternateEmail());
    }
}
