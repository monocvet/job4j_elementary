package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double result = (h * k) * h;
        return result;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);

        double result2 = RectangleArea.square(24, 5);
        System.out.println(" p = 24, k = 5, s = 20, real = " + result2);
    }
}
