package com.mackodev.service;

import com.mackodev.modal.Order;
import com.mackodev.modal.Seller;
import com.mackodev.modal.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionsBySellerId(Seller seller);
    List<Transaction> getAllTransactions();
}
