import java.util.Scanner;
public class Pattern {
    public static void pattern9(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");

            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");

            }
            for(int j=0; j<2*n-2*i-1; j++){
                System.out.print("*");
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");

            }
            for(int j=0; j<2*n-2*i-1; j++){
                System.out.print("*");
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");

            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void pattern10(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern11(int n) {
        int start=1;
        for(int i=0; i<n; i++){
            if(i%2==0) start=1;
            else start=0;
            for(int j=0; j<=i; j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
       

    }
    public static void pattern12(int n) {
        int space=2*(n-1);
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(" "+j);
            }
            System.out.println();
            space-=2;
        }
    }
    public static void pattern13(int n) {
        int start=1;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(start+" ");
                start=start+1;
            }
            System.out.println();
        }
            
    }
    public static void pattern14a(int n) {
        int asciiValue=65;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                char character= (char) asciiValue;
                System.out.print(character+" ");
                asciiValue=asciiValue+1;
            }
            System.out.println();
        }
        
    }
    public static void pattern16(int n) {
        int asciiValue=65;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                char character= (char) asciiValue;
                System.out.print(character+" ");
                //
            }
            System.out.println();
            asciiValue=asciiValue+1;
        }
        
    }
    public static void pattern14(int n) {
        //int asciiValue=65;
        for(int i=1; i<=n; i++){
            for(char ch='A'; ch<'A'+i; ch++){
               // char character= (char) asciiValue;
                System.out.print(ch+" ");
                //asciiValue=asciiValue+1;
            }
            System.out.println();
            
        }
        
    }
    public static void pattern15(int n) {
        for(int i=1; i<=n; i++){
            for(char ch='A'; ch<='A'+n-i; ch++){
               // char character= (char) asciiValue;
                System.out.print(ch+" ");
                //asciiValue=asciiValue+1;
            }
            System.out.println();
            
        }
        
    }
    public static void pattern17(int n){
        
        for(int i=0; i<n; i++){
            
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1; j<=2*i+1; j++){
                System.out.print(ch);
                if (j<=breakpoint)ch++;
                else ch--;
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
                
        }
        
    }
    public static void pattern18(int n){
        for (int i = 0; i<n; i++) {
            for (char ch =(char)('E' - i); ch<='E'; ch++) {
                
                System.out.print(ch+" ");
            }
            
            System.out.println();
        }
    }
    public static void pattern19(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*i; j++){
                System.out.print(" ");

            }
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
                
        }
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*n-2*i; j++){
                System.out.print(" ");

            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
                
        }

    }
    public static void pattern20(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<2*n-2*i-2; j++){
                System.out.print(" ");

            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
                
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<=n-i-1; j++){
                System.out.print("*");
            }
            for(int j=1; j<2*i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=n-i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
      
    public static void pattern21(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        
    }  
    
    public static void pattern22(int n){
        for(int i=0;i<2*n-1;i++){
         
         // inner loop for no. of columns.
         for(int j=0;j<2*n-1;j++){
             
             // Initialising the top, down, left and right indices of a cell.
             int top = i;
             int bottom = j;
             int right = (2*n - 2) - j;
             int left = (2*n - 2) - i;
             
             // Min of 4 directions and then we subtract from n
             // because previously we would get a pattern whose border
             // has 0's, but we want with border N's and then decrease inside.
             System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
         }
         
         // As soon as the numbers for each iteration are printed, we move to the
         // next row and give a line break otherwise all numbers
         // would get printed in 1 line.
         System.out.println();
     }

    }  

    public static void main( String[] args){
        Scanner sc= new Scanner( System.in);
        int n= sc.nextInt();
        sc.close();
        pattern22(n);
    }
}