package odev3.İlkSoru;

public class Employee {
   int ıd ;
   String name;
   double salary;
   String department;

    public Employee(int ıd, String name, double salary, String department) {
        this.ıd = ıd;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return ıd;
    }

    public void setId(int ıd) {
        this.ıd = ıd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public double calculateBonus() {
        return 0;
    }
}
