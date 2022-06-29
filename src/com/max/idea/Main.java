package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double feet, meter, mille, yard;
        double kilogram, gram, pound, tonne;
        char operation, operation1, operation2 ;

        Scanner input = new Scanner(System.in);

        System.out.println("Выбор величины: 1 - масса, 2 - расстояние");
        operation = input.next().charAt(0);

        switch (operation) {

            // масса
            case '1':
                System.out.println("Выберите единицу измерения: 1 - киллограмм, 2 - грамм, 3 - фунт, 4 - тонна");
                operation1 = input.next().charAt(0);
                switch (operation1) {

                    case '1':
                        System.out.println("Введите количество киллограмм:");
                        kilogram = input.nextDouble();
                        gram = kilogram * 1000;
                        pound = kilogram * 2.20462;
                        tonne = kilogram * 0.001;
                        //System.out.println(kilogram + " киллограмм " + "это \n"  + gram + " грамм \n" + pound + " фунт \n" + tonne + " тонна \n");
                        System.out.printf(" %.2f киллограмм это \n %.2f грамм \n %.2f фунт \n %.4f тонна", kilogram, gram, pound, tonne );
                        break;

                    case '2':
                        System.out.println("Введите количество грамм:");
                        gram = input.nextDouble();
                        kilogram = gram * 0.001;
                        pound = gram * 0.00220462;
                        tonne = gram * 0.000001;
                        //System.out.println(gram + " грамм " + "это \n"  + kilogram + " киллограмм \n" + pound + " фунт \n" + tonne + " тонна \n");
                        System.out.printf(" %.2f грамм это \n %.4f киллограмм \n %.4f фунт \n %.6f тонна", gram, kilogram, pound, tonne );
                        break;

                    case '3':
                        System.out.println("Введите количество фунтов:");
                        pound = input.nextDouble();
                        kilogram = pound * 0.453592;
                        gram = pound * 453.592;
                        tonne = pound * 0.000453592;
                        //System.out.println(pound + " фунт " + "это \n"  + kilogram + " киллограмм \n" + gram + " грамм \n" + tonne + " тонна \n");
                        System.out.printf(" %.2f фунт это \n %.2f киллограмм \n %.2f грамм \n %.9f тонна", pound, kilogram, gram, tonne );
                        break;

                    case '4':
                        System.out.println("Введите количество тонн:");
                        tonne = input.nextDouble();
                        kilogram = tonne * 1000;
                        gram = tonne * 1000000;
                        pound = tonne * 2204.62;
                        //System.out.println(tonne + " тонна " + "это \n"  + kilogram + " киллограмм \n" + gram + " грамм \n" + pound + " фунт \n");
                        System.out.printf(" %.2f тонна это \n %.2f киллограмм \n %.2f грамм \n %.2f фунт", tonne, kilogram, gram, pound );
                        break;
                }
                System.exit(0);
                // расстояние
            case '2':
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                operation2 = input.next().charAt(0);
                switch (operation2) {
                    case '1':
                        System.out.println("Введите количество метров:");
                        meter = input.nextDouble();
                        mille = meter * 0.000621371;
                        yard = meter * 1.09361;
                        feet = meter * 3.28084;
                        //System.out.println(meter + " метр " + "это \n"  + mille + " миля \n" + yard + " ярд \n" + feet + " фут \n");
                        System.out.printf(" %.2f метр это \n %.9f миля \n %.2f ярд \n %.2f фут", meter, mille, yard, feet );
                        break;

                    case '2':
                        System.out.println("Введите количество миль:");
                        mille = input.nextDouble();
                        meter = mille * 1609.34;
                        yard = mille * 1760;
                        feet = mille * 5280;
                        //System.out.println(mille + " миля " + "это \n"  + meter + " метр \n" + yard + " ярд \n" + feet + " фут \n");
                        System.out.printf(" %.2f миля это \n %.2f метр \n %.2f ярд \n %.2f фут", mille, meter, yard, feet );
                        break;

                    case '3':
                        System.out.println("Введите количество ярдов:");
                        yard = input.nextDouble();
                        meter = yard * 0.9144;
                        mille = yard * 0.000568182;
                        feet = yard * 3;
                        //System.out.println(yard + " ярд " + "это \n"  + meter + " метр \n" + mille + " миль \n" + feet + " фут \n");
                        System.out.printf(" %.2f ярд это \n %.2f метр \n %.9f миль \n %.2f фут", yard, meter, mille, feet );
                        break;

                    case '4':
                        System.out.println("Введите количество футов:");
                        feet = input.nextDouble();
                        meter = feet * 0.3048;
                        mille = feet * 0.000189394;
                        yard = feet * 0.33;
                        // System.out.println(feet + " фут " + "это \n"  + meter + " метр \n " + mille + " миль  \n" + yard + " ярд \n");
                        System.out.printf(" %.2f фут это \n %.2f метр \n %.9f миль \n %.2f ярд", feet, meter, mille, yard );
                        break;
                }


        }

    }
}