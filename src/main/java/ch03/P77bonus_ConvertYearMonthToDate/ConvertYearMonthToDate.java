package ch03.P77bonus_ConvertYearMonthToDate;

import java.time.YearMonth;
import java.util.Date;

public class ConvertYearMonthToDate {

    public static void main(String[] args) {       
        
        System.out.println("Date to YearMonth: " + Converters.toYearMonth(new Date()));
        System.out.println("YearMonth to Date: " + Converters.toDate(YearMonth.now()));        
    }
}
