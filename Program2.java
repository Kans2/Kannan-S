 import java.util.*;
public class Program2 {
   
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any Single digit Number");
       int a = sc.nextInt();

       ArrayList<Integer> result = new ArrayList<>();

       if (a <= 1) {
           result.add(a);
       } else {
           result.add(1);
           for (int i = 2; i <= a; i++) {
               int sum = result.get(i - 2) + 2;
               result.add(sum);
           }
       }

       System.out.println(result);
   }

}
