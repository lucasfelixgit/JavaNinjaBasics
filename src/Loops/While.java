package Loops;

public class While {
    public static void main(String[] args) {

        //Java Loops - While

        //while (true) {this code scope will happen}

        int clones = 0;
        int maxClones = 40;

        while (clones <= maxClones) {
            System.out.println("Naruto made a shadow clone! " + clones + "x 🥷");
            clones++; //increment value - avoiding infinite loops.
        }

    }
}