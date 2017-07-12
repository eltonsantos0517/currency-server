package com.elton.base.services;

import com.elton.base.entities.CurrencyEntity;
import com.elton.base.services.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * Created by elton on 11/07/2017.
 */
@Service
public class CurrencyService extends CrudService<CurrencyEntity> {

    @Autowired
    private CrudRepository currencyRepository;

    @Override
    public CrudRepository<CurrencyEntity, Long> getRepository() {
        return currencyRepository;
    }
}
