import java.util.Scanner;
public class primeornot2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
    
    }
    
}
