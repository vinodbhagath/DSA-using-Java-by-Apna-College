package Arrays;
public class ArrayCreate{
    public static void main(String args[]){
        // int num[]=new int[40];
        int n[]={1,2,3,4,5};
        // String arr[]=new String[4];
        //calling the function by passing the array as arguement
        getArray((n));
    for(int i=0;i<n.length;i++){
        System.out.print(n[i]);

    }
    System.out.println();
    int []num=updateArray(n);
    for(int i=0;i<num.length;i++){
        System.out.print(num[i]);
    }
    }
    public static int[] updateArray(int []ar){
        for(int i=0;i<ar.length;i++){
            ar[i]=ar[i]+1;
        }
        return ar;
    }

    public static void getArray(int []arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }

    }


}