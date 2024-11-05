package Arrays;

public class binarySearch {
    public static int search(int num[],int key){
        int strt=0,end=num.length-1;
        while (strt<=end) {
            int mid = (strt+end)/2;
            if(num[mid]==key)
                return mid;
            else if(num[mid]<key)
                strt = mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={10,20,30,40,50};
        //sorted array must be pass
        int rslt=search(num,60);
        if(rslt==-1){
            System.out.println("Not Found");
        }
        else
            System.out.println("Index is:"+rslt);
    }
}
