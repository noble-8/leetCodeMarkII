class Solution {
    public int compress(char[] chars) {
        if(chars.length==1){return chars.length;}
        int ans =0;
        StringBuffer str = new StringBuffer();
        int i=1;
        int c = 0;
        str.append(chars[0]);
        while(i<chars.length){
            if(chars[i]==chars[i-1]){
                c=1;
                i++;
                while(i<chars.length && chars[i]==chars[i-1]){
                    c++;
                    i++;
                }
                str.append(c+1);
            }else{
                str.append(chars[i]);
                i++;
            }
        }
        //change length() with variable
        c = str.length();
        for(int j=0;j<c;j++){
            chars[j] = str.charAt(j);
        }
        return str.length();
        
    }
}