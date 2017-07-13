package com.elton.currencyserver.dtos;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.io.Serializable;

/**
 * Created by elton on 12/07/2017.
 */
@XmlRootElement
@XmlSeeAlso({CurrencyDTO.class})
public class ApiResponse implements Serializable {


    private static final long serialVersionUID = 1L;

    private Integer httpStatusCode;
    private String errorMessage;
    private String httpStatusMessage;
    private Long totalCount;
    private Integer resultCount;
    private String cursor;
    private Object data;

    public ApiResponse() {
    }

    public ApiResponse(String errorMessage, Integer httpStatusCode, String httpStatusMessage, Long totalCount,
                       Integer resultCount, String cursor, Object data) {
        this.httpStatusCode = httpStatusCode;
        this.httpStatusMessage = httpStatusMessage;
        this.totalCount = totalCount;
        this.resultCount = resultCount;
        this.errorMessage = errorMessage;
        this.cursor = cursor;
        this.data = data;
    }

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getHttpStatusMessage() {
        return httpStatusMessage;
    }

    public void setHttpStatusMessage(String httpStatusMessage) {
        this.httpStatusMessage = httpStatusMessage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public static ResponseEntity<ApiResponse> buildResponse(final String errorMessage, final HttpStatus httpStatus,
                                                            final Long totalCount, final Integer resultCount, final String cursor, final Object data) {
        return new ResponseEntity<>(new ApiResponse(errorMessage, httpStatus.value(),
                httpStatus.getReasonPhrase(), totalCount, resultCount, cursor, data), httpStatus);
    }

}
