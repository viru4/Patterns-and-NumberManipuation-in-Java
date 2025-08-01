import java.lang.*;
import java.util.Scanner;
public class LCM {
    //with for loop
    public static void lcmwithforloop(int a, int b) {
        for(int i=1; i<=a*b; i++){
            if(i%a==0 && i%b==0){
                System.out.println("LCM of " + a + " and " + b + " is " + i);
                break;
            }
        }
    }
    
    //with while loop
    public static void lcmwithwhileloop(int a, int b) {
        int big=a>=b?a:b;
        while(true){
            if(big%a==0 && big%b==0){
                System.out.println("LCM of " + a + " and " + b + " is " + big);
                break;
            }
            big++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        lcmwithwhileloop(a, b);
    }
}
