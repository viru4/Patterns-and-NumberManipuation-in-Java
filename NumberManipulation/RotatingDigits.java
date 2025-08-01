
import java.util.Scanner;

public class RotatingDigits {
    public static void Rotate(int k, int num){
    //int k=2;
    //int num=12345;
    int count=0;
    int copy=num;
    if(k < 0) {
        System.out.println("k should be a non-negative integer.");
        return;
    }
    else if(k == 0) {
        System.out.println(num);
        return;
    }
    
    while (num>0){
        count++;
        num=num/10;
    }
    //System.out.println(num);
    //System.out.println(count);
    num=copy;
    for (int i = 0; i < k; i++) {
        int lastdigit= num%10;
        num=lastdigit*(int)Math.pow(10, (count-1))+num/10;
    }
    System.out.println(num);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotations and the number:");
        System.out.print("k: ");
        int k = sc.nextInt();
        System.out.print("num: ");
        int num = sc.nextInt();
        Rotate(k, num);
    }
}
