package UcuncuHaftaOdev.AbstractClassOrnek2;

public class Engineer extends Worker{
    private String sector;

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Engineer(int employmentDate, int salary, String name,String sector) {
        super(employmentDate, salary, name);
        this.sector=sector;
    }
}
