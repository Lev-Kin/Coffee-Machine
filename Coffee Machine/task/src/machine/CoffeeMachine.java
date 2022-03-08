package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // The coffee machine has
        int allWater = 400;
        int allMilk = 540;
        int allCoffee = 120;
        int allCup = 9;
        int allMoney = 550;

        boolean work = true;
        while (work) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String choice = scanner.next();

            switch (choice) {
                case "buy":

                    int waterForOneCup = 0;
                    int milkForOneCup = 0;
                    int coffeeForOneCup = 0;
                    int moneyForOneCup = 0;
                    int cup = 1;

                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String select = scanner.next();

                    if ("1".equalsIgnoreCase(select)) {
                        waterForOneCup = 250;
                        milkForOneCup = 0;
                        coffeeForOneCup = 16;
                        moneyForOneCup = 4;

                        if (allWater < waterForOneCup) {
                            System.out.println("Sorry, not enough water!");
                        } else if (allMilk < milkForOneCup) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (allCoffee < coffeeForOneCup) {
                            System.out.println("Sorry, not enough coffee!");
                        } else if (allCup < cup) {
                            System.out.println("Sorry, not enough cup!");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!");
                            allWater -= waterForOneCup;
                            allMilk -= milkForOneCup;
                            allCoffee -= coffeeForOneCup;
                            allCup -= cup;
                            allMoney += moneyForOneCup;
                        }
                    }

                    if ("2".equalsIgnoreCase(select)) {
                        waterForOneCup = 350;
                        milkForOneCup = 75;
                        coffeeForOneCup = 20;
                        moneyForOneCup = 7;

                        if (allWater < waterForOneCup) {
                            System.out.println("Sorry, not enough water!");
                        } else if (allMilk < milkForOneCup) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (allCoffee < coffeeForOneCup) {
                            System.out.println("Sorry, not enough coffee!");
                        } else if (allCup < cup) {
                            System.out.println("Sorry, not enough cup!");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!");
                            allWater -= waterForOneCup;
                            allMilk -= milkForOneCup;
                            allCoffee -= coffeeForOneCup;
                            allCup -= cup;
                            allMoney += moneyForOneCup;
                        }
                    }

                    if ("3".equalsIgnoreCase(select)) {
                        waterForOneCup = 200;
                        milkForOneCup = 100;
                        coffeeForOneCup = 12;
                        moneyForOneCup = 6;

                        if (allWater < waterForOneCup) {
                            System.out.println("Sorry, not enough water!");
                        } else if (allMilk < milkForOneCup) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (allCoffee < coffeeForOneCup) {
                            System.out.println("Sorry, not enough coffee!");
                        } else if (allCup < cup) {
                            System.out.println("Sorry, not enough cup!");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!");
                            allWater -= waterForOneCup;
                            allMilk -= milkForOneCup;
                            allCoffee -= coffeeForOneCup;
                            allCup -= cup;
                            allMoney += moneyForOneCup;
                        }
                    }

                    if ("back".equalsIgnoreCase(select)) {
                        break;
                    }

                    break;

                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    final int AddWater = scanner.nextInt();

                    System.out.println("Write how many ml of milk you want to add:");
                    final int AddMilk = scanner.nextInt();

                    System.out.println("Write how many grams of coffee beans you want to add:");
                    final int AddCoffee = scanner.nextInt();

                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    int AddCup = scanner.nextInt();

                    allWater += AddWater;
                    allMilk += AddMilk;
                    allCoffee += AddCoffee;
                    allCup += AddCup;
                    break;

                case "take":
                    System.out.printf("I gave you $%d\n", allMoney);
                    allMoney = 0;
                    break;

                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.printf("%d ml of water\n" +
                                    "%d ml of milk\n" +
                                    "%d g of coffee beans\n" +
                                    "%d disposable cups\n" +
                                    "$%d of money\n",
                            allWater, allMilk, allCoffee, allCup, allMoney);
                    break;

                case "exit":
                    work = false;
                    break;

                default:
                    System.out.println("Error");
                    break;
            }
        }

//        System.out.println("\nThe coffee machine has:");
//        System.out.printf("%d ml of water\n" +
//                        "%d ml of milk\n" +
//                        "%d g of coffee beans\n" +
//                        "%d disposable cups\n" +
//                        "$%d of money\n",
//                allWater, allMilk, allCoffee, allCup, allMoney);

//        int minCup;
//        int makeCup;
//
//        boolean isCup = true;
//
//        //while (isCup) {
//
//        System.out.println("Write how many ml of water the coffee machine has:");
//        final int water = scanner.nextInt();
//
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        final int milk = scanner.nextInt();
//
//        System.out.println("Write how many grams of coffee beans the coffee machine has:");
//        final int coffee = scanner.nextInt();
//
//        System.out.println("Write how many cups of coffee you will need:");
//        int cup = scanner.nextInt();
//
//        makeCup = water / waterForOneCup;
//        minCup = makeCup;
//
//        makeCup = milk / milkForOneCup;
//        if (makeCup < minCup) {
//            minCup = makeCup;
//        }
//
//        makeCup = coffee / coffeeForOneCup;
//        if (makeCup < minCup) {
//            minCup = makeCup;
//        }
//
//        if (cup == minCup) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if (cup > minCup) {
//            System.out.printf("No, I can make only %d cup(s) of coffee\n", minCup);
//        } else if (minCup == 0) {
//            System.out.println("No, I can make only 0 cup(s) of coffee");
//        } else {
//            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", minCup - cup);
//        }
//        //}
    }
}
