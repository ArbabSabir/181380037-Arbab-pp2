//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class HourlyEmployee extends Employee {
    private double hours;
    private double hourlyRate;

    public HourlyEmployee(int id, String name, double taxRat, double hours, double hourlyRate) {
        super(id, name, taxRat);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public double getHours() {
        return this.hours;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String toString() {
        String str = "";
        str = "Employee id : " + this.getId() + "\n Employee Name : " + this.getName() + "\n Employee TaxRate : " + this.getTaxRat() + "\n Employee Hours " + this.getHours() + " \n Empolyee Hourly Rate " + this.getHourlyRate();
        return str;
    }

    double CalculateSalery() {
        double gross_pay = this.getHours() * this.getHourlyRate();
        double tax = gross_pay * this.getTaxRat();
        double salery = gross_pay - tax;
        return salery;
    }
}
