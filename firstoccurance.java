public class firstoccurance{
    public static int firstoccuranceelement(int arr[], int k){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+(end-start)/2);
            if(arr[mid]==k){
                ans=mid;
                end=mid-1;
            }else if(arr[mid]>k){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1, 1, 1, 2, 2, 3, 3, 3, 4, 5};
        System.out.println(firstoccuranceelement(arr, 3));
    }
}