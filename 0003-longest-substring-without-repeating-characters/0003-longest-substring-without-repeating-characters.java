class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character> charset=new HashSet<>();
        int left=0;
        int maxl=0;
        for(int right=0;right<s.length();right++){
            while(charset.contains(s.charAt(right))){
                charset.remove(s.charAt(left));
                left++;
            }
            charset.add(s.charAt(right));
            maxl=Math.max(maxl,right-left+1);
        }
        return maxl;
    }
}