package Conditionals;

import java.util.Scanner;

public class UserScanner {
    public static void main(String[] args) {

        //Scanner: A way to bring users into our application.
        //Lesson Objective: User will create a ninja then we'll validate the data.

        Scanner sc = new Scanner(System.in);

        //Receive the ninja name.
        System.out.println("Write here the ninja name: ");
        String name = sc.nextLine();
        System.out.println("The ninja name is: " + name);

        //Receive the ninja age.
        System.out.println("Write here the ninja age: ");
        int age = sc.nextInt();

        if (age < 18){
            System.out.println("The ninja is an adult, and can go on missions outside the village.");
        } else {
            System.out.println("The ninja is too young, and need more training to go on missions outside the village");
        }


        //Always close the scanner.
        sc.close();
    }
}