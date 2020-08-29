//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[]{new SalariedEmployee(12, "Arbab", 12.5D, 14000.0D), new SalariedEmployee(20, "Amir", 25.6D, 4000.0D), new HourlyEmployee(21, "Rizwan", 25.2D, 12.0D, 1200.0D), new HourlyEmployee(22, "Awab", 24.2D, 14.0D, 1200.0D), new CommissionedEmployee(23, "Numan", 4.2D, 20.0D, 10.0D), new CommissionedEmployee(24, "Ansar", 5.9D, 40.0D, 10.0D)};

        for(int i = 0; i < emp.length; ++i) {
            double s1 = 0.0D;
            s1 = emp[i].CalculateSalery();
            System.out.println(s1);
        }

    }
}
