package UcuncuHaftaOdev.İlkSoru;

public class Maincik {
    public static void main(String[] args) {
       Manager manager = new Manager(1,"Mehmet",75000,"Backend",100);
       Developer developer = new Developer(5,"Ali",120000,"Full Stack ","Yazılım");

        System.out.println("Manager Bilgileri :");
        System.out.println("ID : "+manager.getId());
        System.out.println("İsim : "+manager.getName());
        System.out.println("Maaş : "+manager.getSalary());
        System.out.println("Depatman : "+manager.getDepartment());
        System.out.println("Manager Bonus: " + manager.calculateBonus());

        System.out.println("Developer Bilgileri : ");
        System.out.println("ID : "+developer.getId());
        System.out.println("İsim : "+developer.getName());
        System.out.println("Maaş : "+developer.getSalary());
        System.out.println("Depatman : "+developer.getDepartment());
        System.out.println("Developer Bonus: " + developer.calculateBonus());
    }
}
