import java.util.*;
public class BinarySearch{

    public static int binarysearch(int arr[], int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={23,34,45,56,78,89};
        int key=78;
        System.out.println(binarysearch(arr, key));        
    }
}