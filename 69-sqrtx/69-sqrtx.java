class Solution {
    
    public int mySqrt(int x) {
        if(x==1){return 1;}
        int i=0;
        int j = x;
        int mid=(i+j)/2;
        while(i<j){
            mid = (i+j)/2;
            if(mid==x/mid ||(mid <x/mid)&&( (mid+1) >x/(mid+1))){return mid;}
            else if(mid>x/mid){j=mid;}
            else{i=mid;}
        }
        return mid;
    }
}