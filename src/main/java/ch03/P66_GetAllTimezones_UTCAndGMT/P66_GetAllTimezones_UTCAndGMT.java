package ch03.P66_GetAllTimezones_UTCAndGMT;

import java.util.Collections;
import java.util.List;

public class P66_GetAllTimezones_UTCAndGMT {

    public static void main(String[] args) {
    
        List<String> timezones7 = DateTimes.fetchTimeZones7(DateTimes.OffsetType.UTC);                
        List<String> timezones8 = DateTimes.fetchTimeZones8(DateTimes.OffsetType.UTC);
        
        Collections.sort(timezones8);
        timezones8.forEach(System.out::println);
    }
    
}
