public class averageofarray {
    public static void main(String[] args){
        int[] num={78,87,90,65,78};
        int count=0;
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum += num[i];
            count++;
        }
        System.out.println(sum);
        System.out.println(count);
        float avg=(float)sum/count;
        System.out.println(avg);

    }
    
}
