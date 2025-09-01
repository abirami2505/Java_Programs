 import java.util.Scanner;
public class stringreverse1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        char[] ch = str.toCharArray();
        String reverse="";
        for(int i = str.length()-1 ; i>=0;i--){
            reverse +=ch[i];
        }
        System.out.println(reverse);

    }
    
}
