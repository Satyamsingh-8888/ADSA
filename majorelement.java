public class majorelement{

    public static int majorel(int arr[]){
        int cand=0;
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(count==0){
                cand=arr[i];
            }
            if(cand==arr[i]){
                count++;
            }else{
                count--;
            }
        }
        return cand;
    }
    public static void main(String[] args){
        int arr[]={3,2,3};
        System.out.println(majorel(arr));
    }
}