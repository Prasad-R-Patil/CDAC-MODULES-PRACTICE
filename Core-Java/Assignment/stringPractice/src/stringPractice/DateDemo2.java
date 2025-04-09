package stringPractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo2 {
    
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date (dd/MM/yyyy): ");
        String input = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(input); // convert string to java.util.Date
        
        String str = sdf.format(date);

        System.out.println("Parsed Date: " + str);
        sc.close();
    }

}
