import java.util.Scanner;
public class swapnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(); //4
        int b=sc.nextInt(); //7
        int temp;
        temp=a+b; //11
        a=temp-a; //7
        System.out.println(a);
        b=temp-b; //4
        System.out.println(b);


    }
    
}
