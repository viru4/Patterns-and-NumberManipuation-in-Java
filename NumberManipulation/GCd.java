import java.util.Scanner;

public class GCd {
    public static void gcdwithforloop(int a, int b) {
        int smaller=a>=b?a:b;
        for (int i = 1; i <=smaller; i++) {
            if(i%a==0&&i%b==0){
                System.out.println("the GCD is: "+i);
            }
        }
    }
    public static void gcdwithwhileloop(int a, int b) {
        int smaller=a<b?a:b;
        while (true) {
            if(smaller%a==0&&smaller%b==0){
                System.out.println("the GCD is: "+smaller);
                break;
            }
            smaller++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        gcdwithforloop(a, b);
    }
}
