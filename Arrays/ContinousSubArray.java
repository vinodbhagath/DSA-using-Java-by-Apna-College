package Arrays;
public class ContinousSubArray {
    public static void main(String[] args) {
        int []num={2,4,6,8,9};
        for(int i=0;i<num.length;i++){//start loop =i
            
            for(int j=i;j<num.length;j++){//end loop

                for(int k=i;k<=j;k++){//loop to print the no frm strt to end 
                    System.out.print(num[k]);

                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
