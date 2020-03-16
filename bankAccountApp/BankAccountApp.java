package bankAccountApp;


import utilities.CSV;

import javax.swing.text.Utilities;
import java.io.IOException;
import java.util.List;


public class BankAccountApp {

    public static void main(String[] args) throws IOException{
        String file = "D:\\downloads\\ajay\\original.csv";

        Checking check1=new Checking("Tom ","1243354",45245);
        Savings sav1=new Savings("sam","6556545",6567276);


        sav1.showInfo();
        check1.showInfo();

            List<String[]> newAccountHolder = utilities.CSV.read(file);
            for (String[] accountHolder : newAccountHolder) {
                System.out.println(accountHolder[0]);
                System.out.println(accountHolder[1]);
                System.out.println(accountHolder[2]);
            }

    }
}
