class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int x= strs[0].length();
        int y;
        int n = strs.length;
        for(int i=1;i<n;i++){
            y= longestCommonPrefix2(strs[i-1],strs[i]);
            if(y<x){
                x =y;
            }
        }
        
        StringBuffer ans = new StringBuffer();
        for(int i=0;i<x;i++){
            ans.append(strs[0].charAt(i));
        }
        return ans.toString();
    }
    
    public int longestCommonPrefix2(String str1,String str2){
        int i=0;
        while(i<str1.length() && i<str2.length() && str1.charAt(i)==str2.charAt(i)){
            i++;
        }
        return i;
    }
}