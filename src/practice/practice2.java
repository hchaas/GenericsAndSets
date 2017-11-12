
package practice;

import edu.wctc.advjava.hch.datetime.DateUtilities;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class practice2 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().plus(1, ChronoUnit.DAYS);
        LocalDate date3 = LocalDate.now().minus(7, ChronoUnit.WEEKS);
        
        DateUtilities dateUtility = new DateUtilities();
        
        List<LocalDate> dateList = new ArrayList<>();
        
        dateList.add(date1);
        dateList.add(date2);
        dateList.add(date3);
        
        for (LocalDate d : dateList){
            System.out.println(dateUtility.convertDateToStringDefault(d));
        }
        
        //convertToStringDefault
    }
}
