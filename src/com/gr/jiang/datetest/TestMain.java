package com.gr.jiang.datetest;

import java.time.*;

/**
 * Created by jiang on 2017/10/16.
 */
public class TestMain {
    public static void main(String [] args){
        final Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis());

        final LocalDate date = LocalDate.now();
        final LocalDate dateFromClock = LocalDate.now(clock);
        System.out.println(date);
        System.out.println(dateFromClock);


        // get the local date and local time
        final LocalTime time = LocalTime.now();
        final LocalTime timeFromCLock = LocalTime.now(clock);
        System.out.println(time);
        System.out.println(timeFromCLock);

        // Get the zoned date/time
        final ZonedDateTime zonedDatetime = ZonedDateTime.now();
        final ZonedDateTime zonedDatetimeFromClock = ZonedDateTime.now( clock );
        final ZonedDateTime zonedDatetimeFromZone = ZonedDateTime.now( ZoneId.of( "America/Los_Angeles" ) );

        System.out.println( zonedDatetime );
        System.out.println( zonedDatetimeFromClock );
        System.out.println( zonedDatetimeFromZone );

    }

}
