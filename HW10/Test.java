package HW10;

public class Test {
    public static void main(String[] args) {

        TestString testString = new TestString("milk, water, milk, chocolate cocktail, whiskey, vodka, whiskey, vodka.");
        printInfo(testString);

    }

    public static void printInfo(TestString testString) {
        System.out.println(testString.infoString());
    }


}