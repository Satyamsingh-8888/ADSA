public class maxsorted {
    public static int max(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+(end-start)/2);
            if(arr[mid]>arr[end]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return arr[start-1];
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(max(arr));
    }
}
