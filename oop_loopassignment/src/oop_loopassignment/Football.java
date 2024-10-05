
package oop_loopassignment;

public class Football {
    public static void main(String[] args) {
        int goal = 0;
        int saves = 5;
        
        System.out.println("Welcome to the Penalty Shootout!");
        System.out.println("Score 3 penalties to win.");

        while (saves > 0) {
            System.out.println("\nPenalties remaining: " + saves);
            System.out.print("Choose direction (left/center/right): ");
            
            if (Math.random() < 0.5) {
                System.out.println("Saved by the goalie!");
            } else {
                System.out.println("Goal! You scored.");
                goal++;
            }
            
            saves--;
        }
        
        System.out.println("\nGame Over!");
        System.out.println("Your final score: " + goal + " goals");
        if (goal >= 3) {
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}
