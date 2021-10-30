package com.company;


public class Main {

    public static void main(String[] args) {
        // write your code here


        aPerson(30,17);
        aPerson(50,50);;
        aPerson(-2,-5);
        aPerson(2,6);
        aPerson(15,-90);

    }

    public static int aPerson(int mensAge, int temperature) {

        if (mensAge > 20 || mensAge < 45 && temperature > -20 || temperature < 30) {
            System.out.println("Можно идти гулять");
        } else if (mensAge < 20 && temperature < 0 || temperature > 28) {
            System.out.println("Можно идти гулять");
        }
        else if (mensAge <45 && temperature >-10 || temperature>28) {
            System.out.println("Можно идти гулять");
        } else System.out.println("Оставайтесь дома");
        return mensAge +temperature;

    }

   // static int generateRandomAge(double max, double min){
     //   int random = (int) Math.random();
       // Random random1 = new Random();

        //System.out.println(random);

        //return (int) (Math.random() * ((max-min)+1);

    }

