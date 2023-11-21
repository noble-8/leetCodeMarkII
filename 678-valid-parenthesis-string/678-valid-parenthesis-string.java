class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        int r = 0;
        int l =0;
        int y=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                l++;
            }
            else if (s.charAt(i)==')'){
                r++;
            }
            else{
                y++;
            }
            if(l-r+y<0){
                return false;
            }
        }
        l=0;
        r=0;
        y=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='('){
                l++;
            }
            else if(s.charAt(i)==')'){
                r++;
            }
            else{
                y++;
            }
            if(r-l+y<0){
                return false;
            }
        }
        return y>= Math.abs(r-l);
    }
}