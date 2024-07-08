package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return result;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(10, 20, 30, 40);
        double result2 = Point.distance(8, 40, 39, 66);
        System.out.println("result1 (10, 20) to (30, 40) " + result1);
        System.out.println("result2 (8, 40) to (39, 66) " + result2);
    }
}
