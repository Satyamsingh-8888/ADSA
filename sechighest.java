public class sechighest {

    public static int secondhighest(int arr[]){
        int first=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>first){
                sec=first;
                first=arr[i];
            }else if(arr[i]>sec && arr[i]!=first){
                sec=arr[i];
            }
        }
        return sec;
    }
    public static void main(String[] args){
        int arr[]={2,4,6,3};
        System.out.println(secondhighest(arr));
    }
}
