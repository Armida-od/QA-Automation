package HW9;

public class SizeCase {
    public static void main(String[] args) {
        String s = sizeCase(SIZE.SMALL);
        String m = sizeCase(SIZE.MEDIUM);
        String l = sizeCase(SIZE.LARGE);
        String el = sizeCase(SIZE.EXTRA_LARGE);
        System.out.println("---");
        System.out.println(s);
        System.out.println("---");
        System.out.println(m);
        System.out.println("---");
        System.out.println(l);
        System.out.println("---");
        System.out.println(el);

    }
    public static String sizeCase(SIZE size) {
        switch (size) {
            case SMALL -> {
                return SIZE.SMALL.toString();
            }
            case MEDIUM -> {
                return SIZE.MEDIUM.toString();
            }
            case LARGE -> {
                return SIZE.LARGE.toString();
            }
            case EXTRA_LARGE -> {
                return SIZE.EXTRA_LARGE.toString();
            }
        }
        return "";
    }
}
