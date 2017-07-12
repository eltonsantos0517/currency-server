package com.elton.base.facades;

import com.elton.base.dtos.ApiResponse;
import com.elton.base.dtos.CurrencyDTO;
import com.elton.base.entities.CurrencyEntity;
import com.elton.base.services.CurrencyService;
import com.elton.base.services.IntegrationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import properties.PropertiesUtil;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by elton on 12/07/2017.
 */

@Component
public class CurrencyFacade {

    @Value(value = "${currencylayer.access.key}")
    private String accessKey;

    @Value(value = "${currencylayer.default.url}")
    private String defaultUrl;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CurrencyService currencyService;

    @Autowired
    private IntegrationService integrationService;

    private Logger LOG = LoggerFactory.getLogger(CurrencyFacade.class);

    public ResponseEntity<ApiResponse> updateCurrencies() {

        try {
            BufferedReader in = integrationService.getInputStreamReaderByURL(defaultUrl + "?access_key=" + accessKey);
            CurrencyDTO currencyDTO = objectMapper.readValue(in, CurrencyDTO.class);
            CurrencyEntity currencyEntity = modelMapper.map(currencyDTO, CurrencyEntity.class);
            currencyService.save(currencyEntity);

            return ApiResponse.buildResponse(null, HttpStatus.OK, null, null, null, PropertiesUtil.getMessage("msg.success.update.currencies"));
        } catch (IOException e) {
            LOG.error(PropertiesUtil.getMessage("msg.error.update.currencies"), e);
            return ApiResponse.buildResponse(PropertiesUtil.getMessage("msg.error.update.currencies"), HttpStatus
                    .INTERNAL_SERVER_ERROR, null, null, null, null);
        } catch (Exception e) {
            LOG.error(PropertiesUtil.getMessage("msg.error.internal"), e);
            return ApiResponse.buildResponse(PropertiesUtil.getMessage("msg.error.internal"), HttpStatus
                    .INTERNAL_SERVER_ERROR, null, null, null, null);
        }
    }
}
