class Solution {
    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();
        
        boolean f = false;
        
        int a1 = a.length()-1;
        int b1 = b.length()-1;
        
        while(a1>=0&&b1>=0){
            
            if(a.charAt(a1)=='1'&&b.charAt(b1)=='1'){
                if(f){
                    ans.append("1");
                }else{
                    ans.append("0");
                }
                f=true;
            }
            else if(a.charAt(a1)=='1'&&b.charAt(b1)=='0'||
                   a.charAt(a1)=='0'&&b.charAt(b1)=='1'){
                if(f){
                    ans.append("0");
                    f=true;
                }else{
                    ans.append("1");
                    f=false;
                }
            }
            else{
                if(f){
                    ans.append("1");
                    f = false;
                }
                else{
                    ans.append("0");
                    f=false;
                }
            }
            
            a1--;
            b1--;
        }
        
        while(a1>=0){
            if(a.charAt(a1)=='1'){
                if(f){
                    ans.append("0");
                    f=true;
                }else{
                    ans.append("1");
                    f=false;
                }
            }
            else{
                if(f){
                    ans.append("1");
                    f = false;
                }
                else{
                    ans.append("0");
                    f=false;
                }
            }
            a1--;
        }
        
        
        
        while(b1>=0){
            if(b.charAt(b1)=='1'){
                if(f){
                    ans.append("0");
                    f=true;
                }else{
                    ans.append("1");
                    f=false;
                }
            }
            else{
                if(f){
                    ans.append("1");
                    f = false;
                }
                else{
                    ans.append("0");
                    f=false;
                }
            }
            b1--;
        }
        
        if(f){
            ans.append("1");
        }
        StringBuffer sna = new StringBuffer();
        a1=ans.length();
        for(int i=a1-1;i>=0;i--){
            sna.append(ans.charAt(i));
        }
        return sna.toString();
    }
}