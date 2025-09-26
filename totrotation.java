public class totrotation {
    public static int total(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+(end-start)/2);
            if(arr[mid]>end){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int arr[]={4,1,2,3};
        System.out.println(total(arr));
    }
}
