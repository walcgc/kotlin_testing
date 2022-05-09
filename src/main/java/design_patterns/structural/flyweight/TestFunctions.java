package design_patterns.structural.flyweight;

public class TestFunctions {

    public static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    public static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}


