package Arrays;

public class LinearSearch {
    public static void main(String arg[]){
        int list[]={20,30,50,40,10};
        int key=10;
        int result = linearSearch(list,key);
        if(result ==-1){
            System.out.println("Not Found");
        }
        System.out.println(result);
    }
    public static int linearSearch(int[]list,int k){
     
        for(int i=0;i<list.length;i++){
            if(list[i]==k)
            return i;
                 
        }
        return -1;
    }
}
