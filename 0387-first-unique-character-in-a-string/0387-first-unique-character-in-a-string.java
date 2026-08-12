class Solution {
    public int firstUniqChar(String s) {
        HashSet <Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!set.contains(ch)&&s.indexOf(ch)==s.lastIndexOf(ch)){
                return i;
            }
            set.add(ch);
        }
        return -1;
    }
}