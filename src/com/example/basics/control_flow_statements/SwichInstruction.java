package com.operators;

public class SwichInstruction {

    enum CarVariant {SEDAN, COMBI, SPORT}

    public static void main(String[] args) {

        //Nowa metoda SWICH
        int menu = 2;
        switch (menu) {
            case 1 -> System.out.println("Menu 1");
            case 2 -> System.out.println("Menu 2");
            case 3 -> System.out.println("Menu 3");
        }


        int num = 10;

        switch (num) {
            case 1:
                System.out.println(1);
                System.out.println("ok");
                break;
            case 3:
                System.out.println(3);
                break;
            case 5:
                System.out.println(5);
                break;
            case 12:
                System.out.println(12);
                break;
            default:
                System.out.println("wszystko inne + " + num);
        }


        String str = "Ania";
        switch (str) {
            case "Ola:":
                System.out.println("Ola");
                break;
            case "Bartek":
                System.out.println("Bartek");
                break;
            case "Ania":
                System.out.println("Ania");
                break;
            default:
                System.out.println("Pozostałę");

        }

        CarVariant car = CarVariant.COMBI;
        switch (car) {
            case COMBI:
                System.out.println(CarVariant.COMBI);
                break;
            case SEDAN:
                System.out.println(CarVariant.SEDAN);
                break;
            case SPORT:
                System.out.println(CarVariant.SPORT);
                break;
            default:
                System.out.println("CAR" + car);
        }
    }
}
