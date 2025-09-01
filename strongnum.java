import java.util.Scanner;
public class strongnum {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();           //get no 145
    int num =n;                   // assign num ==145 to check them finaly
    int sum=0;
    while(n>0){                  // checking the number is greater than 0
        int digit=n%10;          //get the last digit 
        int fact=1;//assign fact=1 becz whether i assign 1 before the loop this value chngs constantly 
        for(int i=1;i<=digit;i++){//doing factoril concept here
            fact=fact*i;
        }
        sum +=fact;      //after the loop we should all the values 
        n=n/10;   //getting quotient 
    }
    System.out.println(sum);
    if(sum==num){   //145 == 145 
        System.out.println("Strong");
    }
    else{
        System.out.println("not strong");
    }
    
   }    
}
