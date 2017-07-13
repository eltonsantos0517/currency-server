package com.elton.currencyserver.repositories;

import com.elton.currencyserver.entities.CurrencyEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by elton on 26/06/2017.
 */
public interface CurrencyRepository extends CrudRepository<CurrencyEntity, Long> {

    CurrencyEntity findFirstByOrderByCreationTimeDesc();
}
