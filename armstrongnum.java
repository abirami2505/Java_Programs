import java.util.Scanner;
public class armstrongnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String str=Integer.toString(num);
        int length=str.length();
        int temp=num;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            sum += Math.pow(digit,length); //digit changes accordingly
            temp=temp/10;
        }
        if(sum==num){
            System.err.println("Armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
        
    }
    
}
