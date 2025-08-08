public class VowelsCount {
    public static void main(String[] args) {
        //using loops
        String str="virendra";
        int count=0;
        int hash[] = {'a','e','i','o','u'};
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            for(int j=0; j<hash.length; j++){
                if(ch == hash[j]){
                    count++;
                    System.out.println("Vowel found: " + ch + " Count: " + count);
                    // break;
                }
            }
        }
        System.out.println("Total Vowels Found: " + count);
    }

    //using recursion
    // public static void vowelcount(String str, int count){
    //     if(str.length()==0){
    //         System.out.println("Total Vowels Found: " + count);
    //         return;
    //     }
    //     if(str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i' || str.charAt(0)=='o' || str.charAt(0)=='u'){
    //         count++;
    //         System.out.println("Vowel found: " + str.charAt(0) + " Count: " + count);
    //     } else {
    //         System.out.println("Consonant found: " + str.charAt(0));
    //     }
    //     vowelcount(str.substring(1), count);
    // }
   
    // public static void main(String[] args) {
    //     vowelcount("virendra",0);
    // }
}



        }
    }
}

