package Arrays;

public class ReverseArray {
    public static int[] reverse(int []num1){
      int strt=0,end=num1.length-1;
      while(strt<end){
        int temp = num1[strt];
        num1[strt]=num1[end];
        num1[end]=temp;
        strt++;
        end--;
      }
      return num1;
    }
 public static void main(String[] args) {
    int []num={10,30,60,70,80};
    reverse(num);
    System.out.println(num.length);
    for(int i=0;i<num.length;i++){
        System.out.println(num[i]);
    }
 }    
}
