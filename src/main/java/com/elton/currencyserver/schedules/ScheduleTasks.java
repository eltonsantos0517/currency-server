package com.elton.currencyserver.schedules;

import com.elton.currencyserver.facades.CurrencyFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by elton on 26/06/2017.
 */
@Component
public class ScheduleTasks {

    @Autowired
    private CurrencyFacade currencyFacade;

    @Scheduled(cron = "0 0/30 * * * ?")
    public void updateCurrencies() throws Exception{
        currencyFacade.updateCurrencies();
    }
}
