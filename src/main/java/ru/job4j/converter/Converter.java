package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(260);
        System.out.println("260 rubles are " + dollar + " dollar.");
        System.out.println("140 rubles are " + euro + " euro.");

        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float input2 = 120;
        float expected2 = 2;
        float output2 = Converter.rubleToDollar(input2);
        boolean passed2 = expected2 == output2;
        System.out.println("120 rubles are 2. Test result : " + passed2);

    }
}
