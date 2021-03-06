package ru.job4j;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140F);
        float dollar = Converter.rubleToDollar(140F);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar. ");
        float in1 = 140;
        float expected1 = 2;
        float out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2 euro. Test result : " + passed1);
        float in2 = 140;
        float expected2 = 2.3333333F;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2.3333333 dollar. Test result : " + passed2);
    }
}
