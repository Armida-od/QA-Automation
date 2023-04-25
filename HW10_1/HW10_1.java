package HW10_1;

public class HW10_1 {
        public static void main(String[] args) {

            String testString = "milk, water, milk, chocolate cocktail, whiskey, era, vodka, whiskey, vodka.";
            printInfo(testString);
        }

        public static void printInfo(String testString) {
            System.out.println(TestMethod.testMethod(testString));
        }
}
