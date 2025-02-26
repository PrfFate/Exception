package com.aliacar.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {

    // Saniye Dakika Saa8t Gün(15) Ay Haftanın günü(Pazar)
    @Scheduled(cron ="10 08 15 * *  *")
    public void write1To10(){

        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
    }
}
