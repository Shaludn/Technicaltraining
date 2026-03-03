package week2.Nestedclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateandTime {
    public static void main(String[] args) {

        LocalDate d=LocalDate.now();
        System.out.println("Date: "+ d);
        LocalTime  t=LocalTime.now();
        System.out.println("Time: "+ t);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("Date & Time : "+ dt);// the T in output stands for time.
        //Display the day of the month
        //Display the day of the year
        //Display the week name, month name, month number....

        /*
          E-name of the day
          D- nnumber of day in the year
          dd - day f the month(1-31)
          M-month number
          MMM- month name...
         */
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String fdtf=dt.format(dtf);
        System.out.println("Formatted Data :" + fdtf);
    }
}
