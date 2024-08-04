
public class DiceRoller {

    public static void main(String[] args) {
        int roll = 0;
        int[] diceRolls = new int[21]; // Increase the array size to accommodate all rolls
        int totalRolls = 0;

        // Sample the rolls
        for (int count = 0; count < 1000; count++) {
            roll = (int)(Math.random() * 20) + 1;
            diceRolls[roll]++; // Increment the correct index
        }

        // Run a report
        for (int index = 1; index < diceRolls.length; index++) { // Start from 1 to match dice roll values
            System.out.printf("Count of %d is: %d%n", index, diceRolls[index]);
            totalRolls += diceRolls[index];
        }

        System.out.println("Total rolls were: " + totalRolls);
        System.out.println("Code by Nishchay Arora");
    }
}
