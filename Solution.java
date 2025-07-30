import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();  // read a
        int b = sc.nextInt();  // read b
        int n = sc.nextInt();  // number of terms
        sc.close();

        int sum = a;
        for (int i = 0; i < n; i++) {
            sum += (int)Math.pow(2, i) * b;
            System.out.print(sum + " ");
        }
    }
}
