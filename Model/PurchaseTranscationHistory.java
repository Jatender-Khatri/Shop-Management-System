/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.model;

import java.util.Date;

/**
 *
 * @author Jatendar
 */
public class PurchaseTranscationHistory extends SameResult{
    private Integer purcchaseTranscationHistoryId ;
    private Purchase purchase;
    private Account account;
    private String remarks,status,transcationAmount;
    private Date purchaeDate;

    public Integer getPurcchaseTranscationHistoryId() {
        return purcchaseTranscationHistoryId;
    }

    public void setPurcchaseTranscationHistoryId(Integer purcchaseTranscationHistoryId) {
        this.purcchaseTranscationHistoryId = purcchaseTranscationHistoryId;
    }

    public String getTranscationAmount() {
        return transcationAmount;
    }

    public void setTranscationAmount(String transcationAmount) {
        this.transcationAmount = transcationAmount;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Date getPurchaeDate() {
        return purchaeDate;
    }

    public void setPurchaeDate(Date purchaeDate) {
        this.purchaeDate = purchaeDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
