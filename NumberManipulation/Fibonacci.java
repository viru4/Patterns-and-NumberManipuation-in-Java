
import java.util.Scanner;

public class Fibonacci {
    public static void Fibonacci(int  n) {
        //n is number of terms you want to print
        int first=0, second=1, next;
        if(n<=0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        System.out.print("Fibonacci Series: " + first + " " + second);
        for (int i = 0; i < n; i++) {
            //System.out.print(first+" ");
            next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        Fibonacci(n);
    }
}
