package Arrays;

public class BuySell {
    public static int maxProfit(int prices[]){
        int maxprft=0;
        int buyPrice = Integer.MAX_VALUE;
        // System.out.println(buyPrice);
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int prf=prices[i]-buyPrice;
                maxprft  = Math.max(prf,maxprft);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxprft;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
      
        System.out.println(  maxProfit(prices));
    }
}
