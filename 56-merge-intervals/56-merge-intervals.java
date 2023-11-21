class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(o1,o2)-> {
            
            if(o1[0]==o2[0]){
                return o1[1]-o2[1];
            }else{
                return o1[0]-o2[0];
            }
        });
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int i=0;
        int start =0;
        int end =0;
        while(i<intervals.length){
        
            start = intervals[i][0];
            end = intervals[i][1];
            i++;
            while(i<intervals.length && intervals[i][0]<=end){
                if(intervals[i][1]>end)
                end = intervals[i][1];
                if(intervals[i][0]<start){
                    start = intervals[i][0];
                }
                i++;
            }
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(start);
            temp.add(end);
            list.add(temp);
        }
        
        int n = list.size();
        int arr[][] = new int[n][2];
        
        i=0;
        for(List<Integer> l:list){
            arr[i][0]=l.get(0);
            arr[i][1]=l.get(1);
            i++;
        }
        return arr;
    }
    


    
}