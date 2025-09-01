public class oddandevenarray {
    public static void main(String[] args){
        int[] arr={10,13,16,17,20};
       int [] evenarray=new int [arr.length];
       int [] oddarray=new int [arr.length];
       int evenIndex=0,oddIndex=0;
       int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenarray[evenIndex++]=arr[i];
            }

            else{
                oddarray[oddIndex++]=arr[i];
                
            }

        }
        System.out.println(evenIndex);
        System.out.println(oddIndex);
    }
    
}
