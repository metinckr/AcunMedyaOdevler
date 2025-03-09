package odev3.AbstractClassOrnek2;

public class Doctor extends Worker{
    private String policlinic;

    public String getPoliclinic() {
        return policlinic;
    }

    public void setPoliclinic(String policlinic) {
        this.policlinic = policlinic;
    }

    public Doctor(int employmentDate, int salary, String name,String policlinic) {
        super(employmentDate, salary, name);
        this.policlinic =policlinic;
    }
}
