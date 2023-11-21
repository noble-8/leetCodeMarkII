class Solution {
    public boolean canConstruct(String r, String m) {
        int ml = m.length();
        int rl = r.length();
        if(ml<rl){return false;}
        int[] arr = new int[26];
        for(int i=0;i<ml;i++){
            arr[m.charAt(i)-'a']++;
        }
        
        for(int i=0;i<rl;i++){
            arr[r.charAt(i)-'a']--;
            if(arr[r.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
    }
}