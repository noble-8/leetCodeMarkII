class Solution {
    public int climbStairs(int n) {
        if(n==1){return 1;}
        int o = 1;
        int t =2;
        int prv=0;
        for(int i=2;i<n;i++){
            prv = o;
            o=t;
            t=prv+t;
        }
        
        return t;
    }
}