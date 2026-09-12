class Solution {
    public boolean backspaceCompare(String s, String t) {
        int left=s.length()-1;
        int right=t.length()-1;
        int skip1=0;
        int skip2=0;
        while(left>=0 || right>=0){
            while(left>=0){
                if(s.charAt(left)=='#'){
                    skip1++;
                    left--;
                }
                else if(skip1>0){
                    skip1--;
                    left--;
                }
                else{
                    break;
                }
            }
            while(right>=0){
                if(t.charAt(right)=='#'){
                    skip2++;
                    right--;
                }
               else if(skip2>0){
                    skip2--;
                    right--;
                }
                else{
                    break;
                }
            }
            if(left>=0 && right>=0 && s.charAt(left)!=t.charAt(right)){
                return false;
            }
            if((left>=0)!=(right>=0)){
                return false;
            }
            left--;
            right--;
            }
        return true;
        }
        }