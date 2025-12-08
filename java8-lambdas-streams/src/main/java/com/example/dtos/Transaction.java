package com.example.dtos;
import java.time.LocalDate;

public class Transaction {
    private String id;
    public Transaction(String id, LocalDate date, double amount) {
        this.id = id;
        this.date = date;
        this.amount = amount;
    }
    private LocalDate date;
    private double amount;
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Transaction [id=" + id + ", date=" + date + ", amount=" + amount + "]";
    }
    public void setId(String id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
