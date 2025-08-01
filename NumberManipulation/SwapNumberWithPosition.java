import java.util.Scanner;

public class SwapNumberWithPosition {
    public static void SwapNumberWithPosition(int num) {
        int count=0;
        int Newnum=0;
        // This method swaps the digits of the number with their positions
        // For example, if the input is 32145, position is 54321 of each digit respectively
        // it will output 12543
        // where 5 is at position 1, 4 is at position 2, and so on.
        // The last digit is at position 5, the second last at position 4, etc.


        while(num!=0){
            // Extract the last digit and calculate its new position
            // The last digit will be at position 1, the second last at position 2
            int digit=num%10;

            count++;
            Newnum = Newnum+count*(int)Math.pow(10, digit-1);

            num=num/10;
        }
        // Print the new number after swapping
        System.out.println("The number after swapping the digits with their positions is:");
        System.out.println(Newnum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("The digits value should not be greater than the length of the number. : ");
        System.out.print("enter the number you want to swap with the position :");
        int num=sc.nextInt();
        sc.close();
        SwapNumberWithPosition(num);
    }
    
}
