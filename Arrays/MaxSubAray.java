package Arrays;
public class MaxSubAray {

    public static  int maxSum(int [] nnum){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nnum.length;i++){
            for(int j=i;j<nnum.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                 sum+=nnum[k];
               
                    
                }
                System.out.println(sum);
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        int mX=maxSum(num);
        System.out.println("MAx Sum"+mX);

    }
}   
