public class Feeder {

    /**
     * The amount of food, in grams, currently in the bird feeder; initialized
     * in the constructor and always greater than or equal to zero
     */
    private int currentFood;

    public Feeder() {
        currentFood = 0; // Default to 0 or set to any desired initial value
    }

    public Feeder(int c) {
        currentFood = c; // Initialize currentFood
    }

    /**
     * Simulates one day with numBirds birds or possibly a bear at the bird
     * feeder, as described in part (a). Precondition: numBirds > 0
     */
    public void simulateOneDay(int numBirds) {
        // 5% chance that a bear comes and empties the feeder
        if (Math.random() < 0.05) {
            currentFood = 0; // Bear empties the feeder
        } else {
            int eaten = 0; // Total food eaten by all birds
            for (int i = 0; i < numBirds; i++) {
                eaten += (int) (Math.random() * 41) + 10; // Random food per bird (10 to 50)
            }
            currentFood -= eaten*numBirds; // Reduce current food by the total eaten

            // Ensure currentFood does not go below zero
            if (currentFood < 0) {
                currentFood = 0; // Feeder is emptied
            }
        }
    }

    /**
     * Returns the number of days birds or a bear found food to eat at the
     * feeder in this simulation, as described in part (b). Preconditions:
     * numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays) {
        int days = 0; // Count of days with food

        while (numDays > 0) {
            numDays--; // Decrement number of days
            if (currentFood > 0) { // Check if there's food to simulate
                simulateOneDay(numBirds);
                days++; // Increment days only if there's food available
            } else {
                break; // Stop if no food is left
            }
            if(currentFood == 0) return days;
        }
        return days; // Return the number of days food was found
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public String toString() {
        return "Current Food: " + currentFood;
    }
}
