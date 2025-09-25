import java.util.*;
public class leader{
    static ArrayList<Integer> leaders(int arr[]){
        ArrayList<Integer> result=new ArrayList<>();
        int n=arr.length;
        int maxfromright=arr[n-1];
        result.add(maxfromright);
        for(int i=n-2; i>=0; i--){
            if(arr[i]>=maxfromright){
                result.add(arr[i]);
                maxfromright=arr[i];
            }
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args){
        int arr[]={100,20,46,9};
        ArrayList<Integer> ans=leader.leaders(arr);
        System.out.println(ans);
    }
}