package UcuncuHaftaOdev.İlkSoru;

public class Manager extends Employee {
    private int teamSize;

    public int getTeamSize() {
        return teamSize;
    }


    public Manager(int ıd, String name, double salary, String department,int teamSize) {
        super(ıd, name, salary, department);
        this.teamSize = teamSize ;

    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }
}
