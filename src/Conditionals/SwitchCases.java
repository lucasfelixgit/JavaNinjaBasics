package Conditionals;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {

        //Switch Cases
        //Lesson Objective: Ask user to choose a specific character.

        //Ask user option
        Scanner sc = new Scanner(System.in);

        System.out.println("🥷 Choose a Ninja: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int userChoice = sc.nextInt();

        //Implement switch cases
        switch (userChoice) {
            case 1:
                System.out.println("You choose Naruto Uzumaki!");
                break;

            case 2:
                System.out.println("You choose Sasuke Uchiha!");
                break;

            case 3:
                System.out.println("You choose Sakura Haruno!");
                break;

            default:
                System.out.println("Invalid Option! Try Again.");
        }


        sc.close();
    }
}
