import java.util.Scanner;
public class oddoreven2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num>=1)
           num -=2;
        if(num==0){
        System.out.println("Even");
        }
        else{
        System.out.println("odd");    
        }


    }
    
}
