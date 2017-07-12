package com.elton.base.schedules;

import com.elton.base.facades.CurrencyFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by elton on 26/06/2017.
 */
@Component
public class ScheduleTasks {

    @Autowired
    private CurrencyFacade currencyFacade;

    //@Scheduled(cron = "*/30 * * * * *")
    public void updateCurrencies() throws Exception{
        currencyFacade.updateCurrencies();
    }
}
