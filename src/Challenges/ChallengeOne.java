package Challenges;

public class ChallengeOne {
    public static void main(String[] args) {

        String ninja1Name = "Naruto Uzumaki";
        int ninja1Age = 14;
        String mission1 = "Rescue the Cat!";
        char mission1Rank = 'D';
        String mission1Status;

        if (ninja1Age < 15) {
            if (mission1Rank == 'C' || mission1Rank == 'D') {
                mission1Status = "Concluded! ✅";
            } else {
                mission1Status = "Not Concluded! ❌";
            }
        }
        else {
            mission1Status = "Concluded! ✅";
        }


        String ninja2Name = "Sasuke Uchiha";
        int ninja2Age = 15;
        String mission2 = "Thieves Hunt!";
        char mission2Rank = 'C';
        String mission2Status;

        if (ninja2Age < 15) {
            if (mission2Rank == 'C' || mission2Rank == 'D') {
                mission2Status = "Concluded! ✅";
            } else {
                mission2Status = "Not Concluded! ❌";
            }
        }
        else {
            mission2Status = "Concluded! ✅";
        }


        String ninja3Name = "Kakashi Hatake";
        int ninja3Age = 35;
        String mission3 = "War Sabotage!";
        char mission3Rank = 'S';
        String mission3Status;

        if (ninja3Age < 15) {
            if (mission3Rank == 'C' || mission3Rank == 'D') {
                mission3Status = "Concluded! ✅";
            } else {
                mission3Status = "Not Concluded! ❌";
            }
        }
        else {
            mission3Status = "Concluded! ✅";
        }


        System.out.println("🥷 NINJA MISSIONS DASHBOARD");

        System.out.println();

        System.out.println("1ª Ninja = " + ninja1Name);
        System.out.println("Mission = " + mission1);
        System.out.println("Mission Rank = " + mission1Rank);
        System.out.println("Mission Status = " + mission1Status);

        System.out.println();

        System.out.println("2ª Ninja = " + ninja2Name);
        System.out.println("Mission = " + mission2);
        System.out.println("Mission Rank = " + mission2Rank);
        System.out.println("Mission Status = " + mission2Status);

        System.out.println();

        System.out.println("3ª Ninja = " + ninja3Name);
        System.out.println("Mission = " + mission3);
        System.out.println("Mission Rank = " + mission3Rank);
        System.out.println("Mission Status = " + mission3Status);

    }
}
