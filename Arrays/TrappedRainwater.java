package Arrays;

public class TrappedRainwater {
    public static int rainWater(int[] height){
        int n=height.length;
        int trappedwater=0;
        //calculate left max aray
        int []lftMax=new int [n];
        lftMax[0]=height[0];
        for(int i=1;i<n;i++){
            lftMax[i]=Math.max(lftMax[i-1],height[i] );
        }
        // for(int i=0;i<lftMax.length;i++){
        //     System.out.println(lftMax[i]);
        // }
        //calculating the right max array
        int []rgtMax =new int[n];
        rgtMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rgtMax[i]=Math.max(height[i],rgtMax[i+1]);
        }
        //   for(int i=0;i<rgtMax.length;i++){
        //     System.out.println(rgtMax[i]);
        // }
        //calculate the trapped rain water 
        //formula = (wtr level - bar height)*width//here width is nglible bcz one
        //wtrlvl=min(lftmax,rghtmax)
        for(int i=0;i<n;i++){
            int w = Math.min(lftMax[i],rgtMax[i]);
            trappedwater += (w-height[i]);
        }
        
        return trappedwater;
    } 
    public static void main(String[]args){
        int height[]={4,2,0,6,3,2,5};
System.out.println(rainWater(height));
    }
}
