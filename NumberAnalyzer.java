import java.util.Scanner;

public class NumberAnalyzer {

    // Feature Focus: Array operations and finding second min/max
    public static void analyzeArray(int[] arr) {
        // Assuming array is processed/sorted for analysis
        int secondLowest = arr[1];
        int secondHighest = arr[arr.length - 2];

        System.out.println("Array Operations Branch Analysis:");
        System.out.println("Second Lowest Number: " + secondLowest);
        System.out.println("Second Highest Number: " + secondHighest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Please input 5 numbers for array operations:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        analyzeArray(numbers);
    }
