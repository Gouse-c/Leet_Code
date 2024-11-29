import java.util.Random;
import java.util.Scanner;

class ShuffleAnArray {
    private int[] nums;
    private int[] original;
    private Random rand = new Random();

    // Constructor to initialize the array
    public ShuffleAnArray(int[] nums) {
        this.nums = nums;
        this.original = nums.clone();
    }

    // Method to reset the array to its original configuration
    public int[] reset() {
        nums = original.clone();
        return nums;
    }

    // Method to shuffle the array randomly
    public int[] shuffle() {
        int[] shuffled = nums.clone();
        for (int i = shuffled.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }
        return shuffled;
    }

    // Method to display the array
    public void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to take user input and perform operations
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter the array elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] userInputArray = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            userInputArray[i] = scanner.nextInt();
        }

        // Creating a ShuffleAnArray object with the user's array
        ShuffleAnArray shuffleAnArray = new ShuffleAnArray(userInputArray);

        while (true) {
            // Display menu for operations
            System.out.println("\nChoose an operation:");
            System.out.println("1. Reset");
            System.out.println("2. Shuffle");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Resetting and displaying the original array
                    int[] resetArray = shuffleAnArray.reset();
                    System.out.print("Reset array: ");
                    shuffleAnArray.displayArray(resetArray);
                    break;
                case 2:
                    // Shuffling and displaying the shuffled array
                    int[] shuffledArray = shuffleAnArray.shuffle();
                    System.out.print("Shuffled array: ");
                    shuffleAnArray.displayArray(shuffledArray);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
