package Arrays;

public class maxSumKadans {
    public  static  void maxSum(int num[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<num.length;i++){
            cs += num[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("Mx Sum:"+ms);
    }
    public static void main(String[] args) {
        int n[]={-2,-3,4,-1,-2,1,5,-3};
        maxSum(n);
    }
}
