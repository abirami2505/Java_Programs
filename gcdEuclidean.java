import java.util.Scanner;
public class gcdEuclidean{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt(); // 12                 
        int n2=sc.nextInt(); //24
        while(n1!=n2){  // 12!=24 T  // 12!=12 F
            if(n1>n2){  //12>24 F                      #method2
                n1=n1-n2;                              
            }
            else{
                n2=n2-n1; //24-12= 12 n2=12
            }

        }
        System.err.println(n1); //12
    }
}
