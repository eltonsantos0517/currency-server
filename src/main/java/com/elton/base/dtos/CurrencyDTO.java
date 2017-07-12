package com.elton.base.dtos;

/**
 * Created by elton on 11/07/2017.
 */
public class CurrencyDTO {

    private String success;
    private String terms;
    private String privacy;
    private String timestamp;
    private String source;
    private QuotesDTO quotes;

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

    public QuotesDTO getQuotes() {
        return quotes;
    }

    public void setQuotes(QuotesDTO quotes) {
        this.quotes = quotes;
    }

    @Override
    public String toString() {
        return "CurrencyDTO{" +
                "sucess='" + success + '\'' +
                ", terms='" + terms + '\'' +
                ", privacy='" + privacy + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", source='" + source + '\'' +
                ", quotes= {" + quotes.toString() + "}" +
                '}';
    }
}
