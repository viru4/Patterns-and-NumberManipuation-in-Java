public class Swapdigit {
    public static void main(String[] args) {
        /*
        int num=72453;
        int first=num/10000;
        int last=num%10;
        int mid=(num%10000)/10;
        //System.out.println(mid);
        int swappednum=last*10000+mid*10+first;
        System.out.println("swapped number is: "+swappednum);
        */
        int num=72453;
        int digits=(int) Math.log10(num);
        int first=num/ (int)Math.pow(10, digits);
        int last=num%10;
        int mid=(num%(int)Math.pow(10, digits))/10;
        int swapped=last*(int)Math.pow(10, digits)+mid*10+first;
        System.out.println(swapped);

    }
}
