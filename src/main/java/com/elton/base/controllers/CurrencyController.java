package com.elton.base.controllers;

import com.elton.base.dtos.ApiResponse;
import com.elton.base.facades.CurrencyFacade;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<ApiResponse> getCurrencies() {
        return currencyFacade.updateCurrencies();
    }
}
