import java.util.*;
public class LinearSearch{
    public static int linearsearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[]={12,34,23,22,11,13};
        int key=23;
        int index=linearsearch(arr, key);
        if(index==-1){
            System.out.println("not found");
        }else{
            System.out.println("found at index :" +index);
        }
    }
}