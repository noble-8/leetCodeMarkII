class Solution {
    public int romanToInt(String s) {
        
        
        
        int ans =0;
        int n=s.length();
        int prv=0;
        int val=0;
        for(int i=0;i<n;i++){
            
            val = getVal(s.charAt(i));
            if(val>prv){
                ans = ans - 2*prv+val;                
            }
            else{
                ans = ans + val;
            }
            prv = val;
        }
        
        return ans;
        
        
    }
    
    public static int getVal(char c){
        
        switch (c){
        case 'I':return 1;
        case 'V':return 5;
        case 'X':return 10;
        case 'L':return 50;
        case 'C':return 100;
        case 'D':return 500;
        case 'M':return 1000;
        default:
        return -1;
        }
    
    }
}