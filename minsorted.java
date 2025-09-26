public class minsorted {
    public static int min(int arr[]){
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
        return arr[start];
    }
    public static void main(String[] args) {
        int arr[]={58, 20, 43, 45};
        System.out.println(min(arr));
    }
}
