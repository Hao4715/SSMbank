package com.design.pojo;

import java.util.List;

public class Account {

    private long id;

    private String cardNo;

    private String password;

    private Double blance;

    private Integer status;

    private List<TransactionRecord> transactionRecords;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getBlance() {
        return blance;
    }

    public void setBlance(Double blance) {
        this.blance = blance;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<TransactionRecord> getTransactionRecords() {
        return transactionRecords;
    }

    public void setTransactionRecords(List<TransactionRecord> transactionRecords) {
        this.transactionRecords = transactionRecords;
    }
}
