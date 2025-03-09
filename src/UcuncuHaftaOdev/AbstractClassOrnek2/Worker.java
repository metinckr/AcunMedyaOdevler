package UcuncuHaftaOdev.AbstractClassOrnek2;

public abstract class Worker {
    private int employmentDate;
    private int salary;
    private String name;

    public Worker(int employmentDate, int salary, String name) {
        this.employmentDate = employmentDate;
        this.salary = salary;
        this.name = name;
    }

    public int getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(int employmentDate) {
        this.employmentDate = employmentDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
