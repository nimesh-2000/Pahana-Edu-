package com.example.pahanabillingsystem.service;

import com.example.pahanabillingsystem.dto.BillItemDTO;
import com.example.pahanabillingsystem.model.Bill;
import com.example.pahanabillingsystem.model.Item;

import java.util.List;

public interface BillService {
    boolean createBill(Bill bill, List<BillItemDTO> items);
}
