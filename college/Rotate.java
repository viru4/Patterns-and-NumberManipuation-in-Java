public class Rotate {
    public static void main(String[] args) {
    int k=2;
    int num=12345;
    int count=0;
    int copy=num;
    /*int digit= num%(int)Math.pow(10, k);
    int digits=(int)Math.log10(num);
    int mid=num/(int)Math.pow(10, k);
    int new=digit*(int)Math.pow(10, (digits-1))+mid;
    */
    while (num>0){
        count++;
        num=num/10;
    }
    System.out.println(num);
    System.out.println(count);
    num=copy;
    for (int i = 0; i < k; i++) {
        int lastdigit= num%10;
        num=lastdigit*(int)Math.pow(10, (count-1))+num/10;
    }
    System.out.println(num);
}


}
