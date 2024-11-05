package Arrays;

public class MaxSubArrayUsinfPreffix {
    //using prefix technic
    //we create one prefix array there we will store the sum of  the sub array 
    //by fornula prefix[i-1]+array[i]
    public static  int maxSum(int [] nnum){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int prefix[]=new int[nnum.length];
        prefix[0]=nnum[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+nnum[i];
        }
        System.out.println("Array of preffix");
        for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i]);
        }
        System.out.println();
        for(int i=0;i<nnum.length;i++){
            for(int j=i;j<nnum.length;j++){
                sum= i==0?sum=prefix[0]:prefix[j]-prefix[i-1];//i=start j=end
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
