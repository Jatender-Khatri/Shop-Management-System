/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.model;

/**
 *
 * @author Jatendar
 */
public class PurchaseDetails extends  SameResult{
    private Integer purchaseDetailsId;
    private Purchase purchase;
    private Product product;
    private String status,total,quantity,purchasePrice;

    public Integer getPurchaseDetailsId() {
        return purchaseDetailsId;
    }

    public void setPurchaseDetailsId(Integer purchaseDetailsId) {
        this.purchaseDetailsId = purchaseDetailsId;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
