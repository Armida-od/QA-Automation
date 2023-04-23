package HW9;
public class SizeMain {
    public static void main(String[] args) {
        printInfo(SIZE.SMALL);
        printInfo(SIZE.MEDIUM);
        printInfo(SIZE.LARGE);
        printInfo(SIZE.EXTRA_LARGE);
    }
    public static void printInfo(SIZE size){
        System.out.println(size);
    }
}
