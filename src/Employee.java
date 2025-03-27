package maas;

public class Employee {
    String name; //adı ve soyad
    private double salary; // calısan maas
    private int workHours; // haftalık çalısma saati
    private int hireYear; // ise baslangıc tarihi


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }


    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int workYear = currentYear - this.hireYear;

        if (workYear < 10) {
            return this.salary * 0.05;
        } else if (workYear >= 10 && workYear < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    public String toString() {
        double tax = tax();  // Vergi hesaplanıyor
        double bonus = bonus();  // Bonus hesaplanıyor
        double raise = raiseSalary();  // Maaş artışı hesaplanıyor
        double totalSalary = this.salary - tax + bonus + raise;  // Toplam maaş hesaplanıyor

        // Bilgiler birleştirilip döndürülüyor
        return "Adı: " + this.name +
                "\nMaaşı: " + this.salary +
                "\nÇalışma Saati: " + this.workHours +
                "\nBaşlangıç Yılı: " + this.hireYear +
                "\nVergi: " + tax +
                "\nBonus: " + bonus +
                "\nMaaş Artışı: " + raise +
                "\nVergi ve Bonuslar ile birlikte maaş: " + (this.salary - tax + bonus) +
                "\nToplam Maaş: " + totalSalary;
    }


}
