package com.elton.currencyserver.services;

import com.elton.currencyserver.entities.CurrencyEntity;
import com.elton.currencyserver.repositories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * Created by elton on 11/07/2017.
 */
@Service
public class CurrencyService extends CrudService<CurrencyEntity> {

    @Autowired
    private CurrencyRepository currencyRepository;

    @Override
    public CrudRepository<CurrencyEntity, Long> getRepository() {
        return currencyRepository;
    }

    public CurrencyEntity getLastCurrency(){
        return currencyRepository.findFirstByOrderByCreationTimeDesc();
    }
}
