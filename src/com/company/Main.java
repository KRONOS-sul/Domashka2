package com.company;


import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here


        aPerson(30, 17);
        aPerson(50, 50);
        ;
        aPerson(-2, -5);
        aPerson(2, 6);
        aPerson(15, -90);
        int[] digit = new int[1];
        for (int i =0; i < digit.length; i++) {
            digit[i] = generateRandomNumber(1, 101);
        }
        System.out.println(Arrays.toString(digit));

    }

    public static int aPerson(int mensAge, int temperature) {

        if (mensAge > 20 || mensAge < 45 && temperature > -20 || temperature < 30) {
            System.out.println("Можно идти гулять");
        } else if (mensAge < 20 && temperature < 0 || temperature > 28) {
            System.out.println("Можно идти гулять");
        } else if (mensAge < 45 && temperature > -10 || temperature > 28) {
            System.out.println("Можно идти гулять");
        } else System.out.println("Оставайтесь дома");
        return mensAge + temperature;

    }

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;

    }


    }

