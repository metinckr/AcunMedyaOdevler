package odev3.AbstractClassOrnek2;

public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Engineer(2019,100000,"Mehmet","Endüstri Mühendisliği");
        Doctor doctor = new Doctor(2015,90000,"Mehmet","Genel Cerrahi");

        System.out.println(doctor.getEmploymentDate());
        System.out.println(doctor.getSalary());
        System.out.println(doctor.getName());
        System.out.println(doctor.getPoliclinic());
        System.out.println("********************************************************");
        System.out.println(engineer.getEmploymentDate());
        System.out.println(engineer.getSalary());
        System.out.println(engineer.getName());
        System.out.println(engineer.getSector());

    }
}
