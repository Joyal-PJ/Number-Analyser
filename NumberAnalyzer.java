import java.util.Scanner;

public class NumberAnalyzer {
    public static void processArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("\nSorted Array: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : ", "));
        }
        System.out.println(" ]");

        int secondLowest = arr[1];
        int secondHighest = arr[n - 2];

        System.out.println("Second Lowest Number: " + secondLowest);
        System.out.println("Second Highest Number: " + secondHighest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Please enter 5 different numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        processArray(numbers);
    }
}
