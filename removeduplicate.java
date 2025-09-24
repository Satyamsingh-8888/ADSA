import java.util.*;
public class removeduplicate {
    ArrayList<Integer> removeduplicate(int arr[]){
        ArrayList<Integer> res=new ArrayList<>();
        if(arr.length==0){
            return res;
        }
        int i=0;
        res.add(arr[0]);
        for(int j=1; j<arr.length; j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
                res.add(arr[j]);
            }
        }
        return res;
    }

    public static void main(String[]args){
        removeduplicate sol=new removeduplicate();
        int nums[]={1,2,4,4,5,5,5};
        ArrayList<Integer> ans=sol.removeduplicate(nums);
        System.out.println(ans);
    }
}
