package com.auroth.coding.controller;

import com.auroth.coding.model.Transaction;
import com.auroth.coding.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {



    @PostMapping("/transaction")
    public ResponseEntity<Transaction> saveTransaction(@RequestBody Transaction product) {
        Transaction savedTransaction = productService.saveTransaction(product);
        return new ResponseEntity<>(savedTransaction, HttpStatus.CREATED);
    }


}