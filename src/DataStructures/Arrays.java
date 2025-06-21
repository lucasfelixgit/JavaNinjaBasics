package DataStructures;

public class Arrays {
    public static void main(String[] args) {

        //Arrays: Non-Primitive type (reference), size and type fixed.

        String[] ninjas = new String[5];
        int[] ages = new int[5];

        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "Hinata Hyuga";
        ninjas[4] = "Kakashi Hatake";

        ages[0] = 14;
        ages[1] = 15;
        ages[2]= 14;
        ages[3] = 13;
        ages[4] = 30;

        System.out.println("✅ NINJA DASHBOARD");
        System.out.println();

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println("🥷 " + (i + 1) + "º Ninja Name: " + ninjas[i]);
            System.out.println("📋 " + (i + 1) + "º Ninja Age: " + ages[i]);
            System.out.println();
        }

        //Garbage Collector: In case of redeclaration of an Array, the previous one will be overwritten.
        //Example: ninjas = new String[7] = {new array, same memory reference*}
    }
}
