package com.company;

public class Main {
    /** Класс Cow (weight, age, gender, nickName)
     ±Класс Sheep(weight, age, gender, nickName)
     ±Класс Horse(weight, age, color, gender, nickName)
     ±Класс Farm(address, cows, horses, sheep, OwnerName)
     ±2 Farm тузунуз.
     ±1-Farmда 3 sheep, 5 cows, 2 horses болсун.
     ±2-Farmда 1 sheep, 1 cow, 1 horse болсун. */

    public static void main(String[] args) {

        System.out.println("***********************************");
        System.out.println("Sheep at Farm-1: ");
        HomeJanibarlar sheep1 = new Sheep(19, 4, 'F', "bla bla");
        HomeJanibarlar sheep2 = new Sheep(23, 6, 'M', "bee beee");
        HomeJanibarlar sheep3 = new Sheep(25, 8, 'F', "beeeee");
        Sheep[] sheep5 = {(Sheep) sheep1, (Sheep) sheep2, (Sheep) sheep3};
        int counter = 0;
        for (Sheep a : sheep5) {
            if (a.getClass().getName().equals("com.company.Sheep")) {
                sheep5[counter] = (Sheep) a;
                counter++;
                System.out.println(a.getNickName() + " " + a.getAge() + " " + a.getGender() + " " +
                        a.getWeight() + " kg.");
            }
        }
        System.out.println("***********************************");
        System.out.println("Sheep at Farm-2: ");
        HomeJanibarlar sheep4 = new Sheep(23, 4, 'M', "Shenok");
        Sheep[] sheep6 = {(Sheep) sheep4};
        int counter1 = 0;
        for (Sheep b : sheep5) {
            if (b.getClass().getName().equals("com.company.Sheep")) {
                sheep5[counter1] = (Sheep) b;
                counter1++;
                System.out.println(b.getNickName() + " " + b.getAge() + " " + b.getGender() + " " +
                        b.getWeight() + " kg.");
            }
        }
        System.out.println("***********************************");
        System.out.println("Cows at Farm-1: ");
        HomeJanibarlar cow1 = new Cow(55.5, 2, 'M', "Muuu");
        HomeJanibarlar cow2 = new Cow(75.4, 4, 'F', "Muu muu");
        HomeJanibarlar cow3 = new Cow(68.6, 3, 'M', "Odnorogiy");
        HomeJanibarlar cow4 = new Cow(44.8, 1, 'F', "Buriy Glaz");
        HomeJanibarlar cow5 = new Cow(38.7, 1, 'M', "Polosatik");
        Cow[] cows = {(Cow) cow1, (Cow) cow2, (Cow) cow3, (Cow) cow4, (Cow) cow5};
        int counter2 = 0;
        for (Cow c : cows) {
            if (c.getClass().getName().equals("com.company.Cow")) {
                cows[counter2] = (Cow) c;
                counter2++;
            }
            System.out.println(c.getNickName() + " " + c.getAge() + " " + c.getGender() + " " + c.getWeight() + " kg.");
        }
        System.out.println("***********************************");
        System.out.println("Cows at Farm-2: ");
        HomeJanibarlar cow6 = new Cow(64.1, 5, 'F', "Obag");
        Cow[] cows7 = {(Cow) cow6};
        int counter3 = 0;
        for (Cow d : cows) {
            if (d.getClass().getName().equals("com.company.Cow")) {
                cows[counter3] = (Cow) d;
                counter3++;
            }
            System.out.println(d.getNickName() + " " + d.getAge() + " " + d.getGender() + " " + d.getWeight() + " kg");
        }
        System.out.println("***********************************");
        System.out.println("Horses at Farm-1: ");
        HomeJanibarlar horse1 = new Horse(90.5, 5, 'F', "Lahmanoguy", "Krasniy");
        HomeJanibarlar horse2 = new Horse(100.6, 4, 'M', "Boec", "Beliy");
        Horse[] horses = {(Horse) horse1, (Horse) horse2};
        int counter4 = 0;
        for (Horse e : horses) {
            if (e.getClass().getName().equals("com.company.Horse")) {
                horses[counter4] = (Horse) e;
                counter4++;
                System.out.println(e.getNickName() + " " + e.getAge() + " " + e.getColor() + " color " + e.getWeight() + " kg " +
                        e.getGender());
            }
        }
        System.out.println("***********************************");
        System.out.println("Horses at Farm-2: ");
        HomeJanibarlar horse3 = new Horse(89.4, 3, 'F', "Bakit", "Goluboy");
        Horse[] horses4 = {(Horse) horse3};
        int counter5 = 0;
        for (Horse f : horses) {
            if (f.getClass().getName().equals("com.company.Horse")) {
                horses[counter5] = (Horse) f;
                counter5++;
                System.out.println(f.getNickName() + " " + f.getAge() + " " + f.getColor() + " color " +
                        f.getWeight() + " kg " +
                        f.getGender());
            }
        }

        Farm farm1 = new Farm("Narin", cows, sheep5, horses, "Sergey");

        System.out.println(farm1);

        Farm farm2 = new Farm("Chuy", cows7, sheep6, horses4, "Danila");

        System.out.println(farm2);
    }
}
