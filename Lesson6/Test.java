package Lesson6;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat(false, "mouse", 4, "white");
        System.out.println(cat.getEats());
        System.out.println(cat.getColor());

        Cat cat1 = new Cat(false, "fish", 3);
        System.out.println(cat1.getColor());
    }
}