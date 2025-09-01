import java.util.Scanner;
import java.util.Arrays;
public class anagramof2string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine().replace(" ","").toLowerCase();
        String str2=sc.nextLine().replace(" ","").toLowerCase();
       
        if(str1.length()!=str2.length()){
            System.out.println("not anagram");
        }
        else{
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
            if(Arrays.equals(arr1, arr2)){
                System.out.println("anagram");
            }
            else{
                 System.out.println("anagram");
            }

            
        }

    }
    
}
