import java.util.*;
public class Largelearr{

    public static int Largelearr(int arr[]){
        int large=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(large<arr[i]){
                large=arr[i];
            }

        }
        return large;
    }
    public static void main(String[] args){
        int arr[]={2,3,4,6,8,7};
        System.out.println(Largelearr(arr));
    }
}