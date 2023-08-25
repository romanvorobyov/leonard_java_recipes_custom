package ch03.P67_GetLocalTimeInAllAvailableTimezones;

import java.util.List;

public class P67_GetLocalTimeInAllAvailableTimezones {

    public static void main(String[] args) {

        List<String> datetimes8 = DateTimes.localTimeToAllTimeZones8();
        datetimes8.forEach(System.out::println);
    }
    
}
