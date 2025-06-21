package DataStructures;

public class Arrays2D {

    public static void main(String[] args) {

        String[][] ninjasAndVillages = new String[3][3];

        ninjasAndVillages[0][0] = "Leaf Village";
        ninjasAndVillages[0][1] = "Naruto Uzumaki";
        ninjasAndVillages[0][2] = "Sasuke Uchiha";

        ninjasAndVillages[1][0] = "Mist Village";
        ninjasAndVillages[1][1] = "Zabuza";
        ninjasAndVillages[1][2] = "Haku";

        ninjasAndVillages[2][0] = "Sand Village";
        ninjasAndVillages[2][1] = "Gaara";
        ninjasAndVillages[2][2] = "Temar";

        for (int i = 0; i < ninjasAndVillages.length; i++) {
            for (int j = 0; j < ninjasAndVillages.length; j++) {
                System.out.println(ninjasAndVillages[i][j]);
            }
        }

    }
}
