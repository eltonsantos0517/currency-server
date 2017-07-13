package com.elton.currencyserver.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by elton on 11/07/2017.
 */
@Entity
@Table(name = "CURRENCY")
public class CurrencyEntity extends BaseEntity {

    private String success;
    private String terms;
    private String privacy;
    private String timestamp;
    private String source;

    @OneToOne(cascade = CascadeType.ALL)
    private QuotesEntity quotes;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public QuotesEntity getQuotes() {
        return quotes;
    }

    public void setQuotes(QuotesEntity quotes) {
        this.quotes = quotes;
    }
}
