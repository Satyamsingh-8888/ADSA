public class maxprod {
    public static int maxproduct(int nums[]){
        if(nums==null || nums.length==0){
            return 0;
        }
        int max=nums[0];
        int min=nums[0];
        int ans=nums[0];
        for(int i=1; i<nums.length; i++){
            int num=nums[i];
            if(num<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(num, max*num);
            min=Math.min(num, min*num);
            ans=Math.max(max, ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,3,-2,4};
        System.out.println(maxproduct(arr));
    }
}
