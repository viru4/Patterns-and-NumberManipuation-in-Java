public class Swap2 {
    public static void main(String[] args) {
        int num=32145;
        int pos=0;
        int sum=0;
        while (num!=0) {
            int digit= num%10;
            pos++;
            int pow=(int)Math.pow(10, digit-1);
            sum=sum+digit*pow;

            
        }
        System.out.println("swapped number"+sum);

    }
}
