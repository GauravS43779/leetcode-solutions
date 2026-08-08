import java.util.*;
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long totalhappiness =0;
        int n=happiness.length;
        for(int i=0;i<k;i++){
            int currhappiness=happiness[n-1-i]-i;
            if(currhappiness>0){
                totalhappiness += currhappiness;
            }
            else{
                break;
            }
        } return totalhappiness;
    }
}