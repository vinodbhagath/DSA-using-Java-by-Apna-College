package Arrays;

public class PairNum {
 public static void main(String[] args) {
    int num[] = {2,3,4,5,6};
    for(int i=0;i<num.length;i++){
        for(int j=i+1;j<num.length;j++){
            System.out.print("Pairs ("+num[i]+" , "+num[j]+") ");
        }
        System.out.println();
    }
 }   
}
