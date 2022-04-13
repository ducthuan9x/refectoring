package Cylinder;

public class Cylinder {
    public static double getVolume(int radius, int height){
        return getBaseArea(radius) * height + 2 * getPerimeter(radius);

    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}
