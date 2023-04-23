package HW9;

public enum SIZE {
    SMALL ("S", 10, 20),
    MEDIUM ("M", 12, 24),
    LARGE ("L", 14, 28),
    EXTRA_LARGE ("XL", 15, 30);

    private String size;
    private int width, length;

    SIZE(String size, int width, int length) {
        this.size = size;
        this.width = width;
        this.length = length;
    }

    public String getSize() {
        return size;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString(){
        return "\"" + getSize() + "\"" + " or " + "\"" + name() + "\"" + " size: width=" + getWidth() + ", length=" + getLength() + ".";
    }

}
