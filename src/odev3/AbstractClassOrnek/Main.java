package odev3.AbstractClassOrnek;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Maya",2,"Dişi");
        Cat cat1 = new Cat("Kıtır",1,"Erkek");

        Dog dog = new Dog("Kartopu",2,"Erkek");

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getGender());
        System.out.println("***********************************************************");
        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());
        System.out.println(cat1.getGender());
        System.out.println("***********************************************************");
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getGender());
    }
}
