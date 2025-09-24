public class removeduplicate2 {
    public static int removeduplicate2(int arr[]){
        if(arr.length<=2){
            return arr.length;
        }
        int i=2;
        for(int j=2; j<arr.length; j++){
            if(arr[j]!=arr[i-2]){
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,1,2,3,3};
        int k=removeduplicate2(arr);
        System.out.println(k);
        for(int i=0; i<k; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
