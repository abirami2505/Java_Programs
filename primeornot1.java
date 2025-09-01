import java.util.Scanner;
public class primeornot1 {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int num = sc.nextInt();
       for(int i=2;i<=num;i++){
        if(num%i==0){
          System.out.println("not prime");
          break;
        }
        else{
           System.out.println("prime");
        }
       }

    }
    
}
