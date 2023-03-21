package faculdadeSenac;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Days {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("d MM yyyy");
        String date = dateFormat.format(new Date());

        int day;
        int month;
        int year;

        System.out.println("Enter your day of birth");
        day = scan.nextInt();

        System.out.println("Enter your month of birth");
        month = scan.nextInt();

        System.out.println("Enter your year of birth");
        year = scan.nextInt();

        System.out.println("Date: " + day + "/" + month + "/" + year);

        year = year * 365;
        month = month * 30;
        int finaldate = day + month + year;

        System.out.println(finaldate + " Days!");
        System.out.println(date);


    }
}
