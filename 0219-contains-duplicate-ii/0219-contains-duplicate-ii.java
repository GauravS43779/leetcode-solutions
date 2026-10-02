class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> duply=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(duply.contains(nums[i])){
                return true;
            }
            duply.add(nums[i]);
            if(duply.size()>k){
                duply.remove(nums[i-k]);
            }
        }
        return false;
    }
}