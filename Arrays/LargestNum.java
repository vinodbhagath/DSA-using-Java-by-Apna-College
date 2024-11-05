package Arrays;

public class LargestNum {
    public static int maxNum(int[] num ){
        int largest = Integer.MIN_VALUE;//-infinnity
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest = num[i];
            }
            if(num[i]<smallest){
                smallest = num[i];
            }

        }
        System.out.println("Small NUm "+smallest);
        return largest;
    }
    public static void main(String args[]){
        int num[]={10,20,30,50,60};
        int rslt = maxNum(num);
        System.out.println(rslt);
    }
}
