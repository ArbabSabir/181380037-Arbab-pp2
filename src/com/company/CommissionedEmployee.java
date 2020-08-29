//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class CommissionedEmployee extends Employee {
    private double sales;
    private double comissionRate;

    public CommissionedEmployee(int id, String name, double taxRat, double sales, double comissionRate) {
        super(id, name, taxRat);
        this.sales = sales;
        this.comissionRate = comissionRate;
    }

    public double getSales() {
        return this.sales;
    }

    public double getComissionRate() {
        return this.comissionRate;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public void setComissionRate(double comissionRate) {
        this.comissionRate = comissionRate;
    }

    public String toString() {
        String str = "";
        str = "Employee id : " + this.getId() + "\n Employee Name : " + this.getName() + " \n Employee TaxRate : " + this.getTaxRat() + "\n Employee Hours " + this.getSales() + " \n Empolyee Comission Rate " + this.getComissionRate();
        return str;
    }

    double CalculateSalery() {
        double gross_pay = this.getSales() * this.getComissionRate();
        double tax = gross_pay * this.getTaxRat();
        double salery = gross_pay - tax;
        return salery;
    }
}
