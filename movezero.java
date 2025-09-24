public class movezero {

    public static void movezerotoend(int arr[]){
        int n=arr.length;
        int lastnonzero=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                arr[lastnonzero]=arr[i];
                lastnonzero++;
            }
        }
        for(int i=lastnonzero; i<n; i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args){
        int arr[]={3,4,6,0,47,8,0};
        movezerotoend(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
