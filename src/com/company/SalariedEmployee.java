//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(int id, String name, double taxRat, double salary) {
        super(id, name, taxRat);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public String toString() {
        String str = "";
        str = "Employee id : " + this.getId() + "\n Employee Name : " + this.getName() + "\n Employee TaxRate : " + this.getTaxRat();
        return str;
    }

    double CalculateSalery() {
        double sal = 0.0D;
        sal = this.salary - this.salary * this.getTaxRat();
        return sal;
    }
}
