class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxlength=0;
        int maxfreq=0;
        int [] freq=new int [26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            maxfreq=Math.max(freq[s.charAt(i)-'A'],maxfreq);
            int windowl=i-left+1;
            int replacement=windowl-maxfreq;
            while(replacement>k){
                freq[s.charAt(left)-'A']--;
                left++;
                windowl=i-left+1;
                replacement=windowl-maxfreq;
            }
            maxlength=Math.max(windowl,maxlength);
        }
        return maxlength;
    }
}