package Conditionals;

public class IfAndElse {
    public static void main(String[] args) {

        // Conditional Statement - If and Else/Else if.
        // Lesson Objective - Level up the ninja rank based on the number of missions completed.

        String name = "Naruto Uzumaki";
        int age = 16;
        short missionsCompleted = 20;
        String rank;
        boolean hokage = false;

        if (missionsCompleted == 10 && age > 15) {
            rank = "Chunnin";
            System.out.println("rank = " + rank);
        } else if (missionsCompleted >= 20 ) {
            rank = "Jounnin";
            System.out.println("rank = " + rank);
        } else {
            rank = "Gennin";
            System.out.println("rank = " + rank);
        }
    }
}
