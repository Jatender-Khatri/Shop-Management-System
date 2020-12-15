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
public class SellTranscationHistory extends SameResult{
    private Integer sellTranscationHistoryId;
    private Order order;
    private Account account;
    private String remarks, status,amount;
    private Date sellingDate;

    public Integer getSellTranscationHistoryId() {
        return sellTranscationHistoryId;
    }

    public void setSellTranscationHistoryId(Integer sellTranscationHistoryId) {
        this.sellTranscationHistoryId = sellTranscationHistoryId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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

    public Date getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(Date sellingDate) {
        this.sellingDate = sellingDate;
    }
    
}
