import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class maxandminiarray {
    public static void main (String[] args){
        int[] numbers={10,20,5,46,67};
        int max=numbers[0];
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("max:" +max);
        System.out.println("min:"+min);
    }
    
}
