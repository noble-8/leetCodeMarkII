class Solution {
    public void setZeroes(int[][] arr) {
        
        int m = arr.length;
        int n = arr[0].length;
        if (m==0&&n==0){
            return;
        }
        boolean[] r = new boolean[arr.length];
        boolean[] c = new boolean[arr[0].length];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    r[i]=true;
                    c[j]=true;
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(r[i]){
                    arr[i][j]=0;
                }
                if(c[j]){
                    arr[i][j]=0;
                }
            }
        }
    }
}