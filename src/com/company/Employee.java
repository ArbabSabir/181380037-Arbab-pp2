//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public abstract class Employee {
    private int id;
    private String name;
    private double taxRat;

    Employee() {
        this.id = 1;
        this.name = "x";
        this.taxRat = 0.1D;
    }

    public Employee(int id, String name, double taxRat) {
        this.id = id;
        this.name = name;
        this.taxRat = taxRat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaxRat(double taxRat) {
        this.taxRat = taxRat;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getTaxRat() {
        return this.taxRat;
    }

    abstract double CalculateSalery();

    public String toString() {
        return "Empty";
    }
}
