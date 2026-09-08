class Solution {
    public boolean isPalindrome(String s) {
        String result=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int left=0;
        int right=result.length()-1;
        while(left<right){
            if(result.charAt(left)!=result.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}