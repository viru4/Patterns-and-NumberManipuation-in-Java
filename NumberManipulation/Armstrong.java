import java.util.Scanner;
public class Armstrong {
    public static void armstrong(int num) {
        int digits=(int)Math.log10(num);
        int sum=0;
        //int count=0;
        while(num>0){
            int digit=num%10;
            int sum+=(int)Math.pow(digit, digits);
            num=num/10;
        }
        if (sum==num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        armstrong(num);
    }   
}
