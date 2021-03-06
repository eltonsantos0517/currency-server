package com.elton.currencyserver.controllers;

import com.elton.currencyserver.dtos.ApiResponse;
import com.elton.currencyserver.facades.CurrencyFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by elton on 26/06/2017.
 */
@RestController(value = "/")
public class CurrencyController {

    @Autowired
    private CurrencyFacade currencyFacade;

    @RequestMapping(method = RequestMethod.GET, value = "update-currencies")
    public ResponseEntity<ApiResponse> updateCurrencies() {
        return currencyFacade.updateCurrencies();
    }

    @RequestMapping(method = RequestMethod.GET, value = "get-all-currencies", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> getLastCurrency(){
        return currencyFacade.getLastCurrency();
    }
}
