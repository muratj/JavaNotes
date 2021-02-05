package com.murat.SortObjects;

public class Customer {
    private int id;
    private String name;
    private boolean isPrime;

    public Customer(int id, String name, boolean isPrime) {
        this.id = id;
        this.name = name;
        this.isPrime = isPrime;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isPrime=" + isPrime +
                '}';
    }
}
