package com.elton.base.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.time.LocalDate;

/**
 * Created by elton on 26/06/2017.
 */
@Entity
@Table(name = "BASE_ENTITY")
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate creationTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDate creationTime) {
        this.creationTime = creationTime;
    }
}
