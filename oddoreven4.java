import java.util.Scanner;

public class oddoreven4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num^1)==(num+1)){
           System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}