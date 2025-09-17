import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Get elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] counts = new int[10]; 

      
        for (int i = 1; i <= 9; i++) {
            for (int num : arr) {
                if (num % i == 0) {
                    counts[i]++;
                }
            }
        }

        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + counts[i]);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
