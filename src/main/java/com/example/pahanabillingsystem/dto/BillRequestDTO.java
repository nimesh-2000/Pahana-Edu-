package com.example.pahanabillingsystem.dto;

import com.example.pahanabillingsystem.model.Item;

import java.time.LocalDateTime;
import java.util.List;

public class  BillRequestDTO {
    private int customerId;
    private List<BillItemDTO> items;
    private int totalQty;
    private double totalAmount;
    private LocalDateTime billDate;

    public BillRequestDTO() {
    }

    public BillRequestDTO(int customerId, List<BillItemDTO> items, int totalQty, double totalAmount, LocalDateTime billDate) {
        this.customerId = customerId;
        this.items = items;
        this.totalQty = totalQty;
        this.totalAmount = totalAmount;
        this.billDate = billDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<BillItemDTO> getItems() {
        return items;
    }

    public void setItems(List<BillItemDTO> items) {
        this.items = items;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDateTime billDate) {
        this.billDate = billDate;
    }
}
