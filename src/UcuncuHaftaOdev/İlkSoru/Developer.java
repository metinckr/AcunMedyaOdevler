package UcuncuHaftaOdev.İlkSoru;

public class Developer extends Employee {
    private String about;
    public Developer(int ıd, String name, double salary, String department,String about) {
        super(ıd, name, salary, department);
        this.about = about;
    }

    public String getAbout() {

        return about;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }
}
