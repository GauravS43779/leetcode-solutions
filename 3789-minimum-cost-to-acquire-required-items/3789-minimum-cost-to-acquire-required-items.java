class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
       long op1=(long) need1*cost1 + (long) need2*cost2;
       long op2=(long) Math.max(need1,need2)*costBoth;
       long op3=(long) Math.min(need1,need2)*costBoth;
       if(need1>need2){
         op3+=(long) (need1-need2)*cost1;
       }
       else{
         op3+=(long) (need2-need1)*cost2;
       }
       return Math.min(op3,Math.min(op1,op2));
    }
}