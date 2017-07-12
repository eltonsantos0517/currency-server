package com.elton.base.services;

import com.elton.base.entities.BaseEntity;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;

/**
 * Created by elton on 11/07/2017.
 */
public abstract class CrudService<T extends BaseEntity> {

    abstract CrudRepository<T, Long> getRepository();

    public T save(T entity) {
        entity.setCreationTime(LocalDate.now());
        return getRepository().save(entity);
    }

    public Iterable<T> save(Iterable<T> entities) {
        return getRepository().save(entities);
    }

    public T findOne(Long id) {
        return getRepository().findOne(id);
    }

    public boolean exists(Long id) {
        return getRepository().exists(id);
    }

    public Iterable<T> findAll() {
        return getRepository().findAll();
    }

    public Iterable<T> findAll(Iterable<Long> ids) {
        return getRepository().findAll(ids);
    }

    public long count() {
        return getRepository().count();
    }

    public void delete(Long id) {
        getRepository().delete(id);
    }

    public void delete(T entity) {
        getRepository().delete(entity);
    }

    public void delete(Iterable<? extends T> entities) {
        getRepository().delete(entities);
    }

    public void deleteAll() {
        getRepository().deleteAll();
    }
}
