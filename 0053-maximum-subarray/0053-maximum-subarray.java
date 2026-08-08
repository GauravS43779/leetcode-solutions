import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int store=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            store=Math.max(store,sum);
            if(sum<0)
                sum=0;
        }
        return store;
    }
}