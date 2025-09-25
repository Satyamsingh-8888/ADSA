import java.util.*;
public class totaloccurance {
    ArrayList<Integer> find(int arr[], int x){
        ArrayList<Integer> result=new ArrayList<>();
        int n=arr.length;

        int start=0;
        int end=n-1;
        int ans1=-1;
        while(start<=end){
            int mid=(start+(end-start)/2);
            if(arr[mid]==x){
                ans1=mid;
                end=mid-1;
            }else if(arr[mid]>x){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        start=0;
        end=n-1;
        int ans2=-1;
        while(start<=end){
            int mid=(start+(end-start)/2);
            if(arr[mid]==x){
                ans2=mid;
                start=mid+1;
            }else if(arr[mid]>x){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        int total=(ans1==-1) ? 0: (ans2-ans1+1);
        result.add(ans1);
        result.add(ans2);
        return result;
    }

    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,3,3,4,5};
        int x=3;
        totaloccurance ans=new totaloccurance();
        System.out.println(ans.find(arr, x));

    }
}
