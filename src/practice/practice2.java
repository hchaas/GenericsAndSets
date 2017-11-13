
package practice;

import edu.wctc.advjava.hch.datetime.DateUtilities;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class practice2 {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.now();
        LocalDateTime date2 = LocalDateTime.now().plus(1, ChronoUnit.DAYS);
        LocalDateTime date3 = LocalDateTime.now().minus(7, ChronoUnit.WEEKS);
        
        DateUtilities dateUtility = new DateUtilities();
        
        List<LocalDateTime> dateTimeList = new ArrayList<>();
        
        dateTimeList.add(date1);
        dateTimeList.add(date2);
        dateTimeList.add(date3);
        
        LocalDateTime today = LocalDateTime.now();
        
        for(int i = 0; i < dateTimeList.size(); i++){
            System.out.println("The difference in days between today and " + dateTimeList.get(i) + " is " + 
                    dateUtility.differenceBetweenTwoDates(today, dateTimeList.get(i), DateUtilities.unitOfTimeReturnType.DAYS));
        }
        
        LocalDate date4 = LocalDate.now().minus(3, ChronoUnit.DAYS);
        LocalDate date5 = LocalDate.now().minus(4, ChronoUnit.HOURS);
        LocalDate date6 = LocalDate.now().plus(6, ChronoUnit.WEEKS);
        
        List<LocalDate> dateList = new ArrayList<>();
        dateList.add(date4);
        dateList.add(date5);
        dateList.add(date6);
        
        
        for (LocalDate d : dateList){
            System.out.println(dateUtility.convertDateToStringDefault(d));
        }
        
        
        
    }
}
