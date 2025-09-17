import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        List<Integer> result = new ArrayList<>();

        int n = (a % 2 == 0) ? a - 1 : a;

        for (int i = 1, count = 0; count < n; i += 2, count++) {
            result.add(i);
        }

        System.out.println(result);
        sc.close();
    }
}

