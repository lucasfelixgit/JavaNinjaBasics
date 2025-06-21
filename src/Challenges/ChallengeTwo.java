package Challenges;

import java.util.Scanner;

public class ChallengeTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menuOption = 0;
        String[] ninjas = new String[1];
        int arraySize;
        int deleteOption;

        while(menuOption != 4) {
            System.out.println("⚔️ NINJA MANAGEMENT SYSTEM");
            System.out.println();

            System.out.println("1. Register Ninjas 🥷");
            System.out.println("2. List Ninjas 📋");
            System.out.println("3. Delete a Ninja ❌");
            System.out.println("4. Exit 🏃‍➡️");
            System.out.println();

            System.out.println("Select an option: ");
            menuOption = sc.nextInt();
            sc.nextLine();

            System.out.println();

            switch (menuOption) {
                case 1:
                    System.out.println("Register Ninjas 🥷");
                    System.out.println();

                    System.out.println("How many ninjas do you want to register?");
                    arraySize = sc.nextInt();
                    sc.nextLine();

                    System.out.println();

                    ninjas = new String[arraySize];

                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println("🥷 " + (i+1) + "º Ninja: ");
                        ninjas[i] = sc.nextLine();
                    }

                    System.out.println();
                    System.out.println("The ninjas were successfully registered! You can list them using the 2nd option at the menu. ✅");
                    System.out.println();

                    break;

                case 2:
                    System.out.println("List Ninjas 📋");
                    System.out.println();

                    System.out.println("Here's a list of all the ninjas registered:");
                    System.out.println();

                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println("🥷 " + (i+1) + "º Ninja: " + ninjas[i]);
                    }

                    System.out.println();
                    System.out.println("The ninjas were successfully listed! ✅");
                    System.out.println();

                    break;

                case 3:
                    System.out.println("Delete a Ninja ❌");
                    System.out.println();

                    System.out.println("Here's a list of all the ninjas registered:");
                    System.out.println();

                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println("🥷 " + (i+1) + "º Ninja: " + ninjas[i]);
                    }

                    System.out.println();
                    System.out.println("Who do you want to delete? (Enter the number of the ninja from the list):");
                    deleteOption = sc.nextInt();
                    sc.nextLine();

                    System.out.println();
                    System.out.println("You choose option " + deleteOption + ": " + ninjas[deleteOption - 1]);
                    System.out.println("❌ Deleting...");

                    for (int i = 0; i < ninjas.length; i++) {
                        int increasedCounter = i + 1;

                        if (deleteOption == increasedCounter) {
                            ninjas[i] = "";
                        }
                    }

                    System.out.println();
                    System.out.println("The ninja was successfully deleted! You can check the updated list using the 2nd option at the menu.");
                    System.out.println();

                    break;

                case 4:
                    System.out.println("Goodbye Hokage! 👋");
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("You selected an invalid option! Try again. ❌");
                    System.out.println();
                    break;

            }

        }

        sc.close();

    }
}






