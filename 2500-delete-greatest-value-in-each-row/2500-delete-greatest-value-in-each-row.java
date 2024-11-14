class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
           
        }
        ArrayList<Integer> list = new ArrayList();
        for(int i=grid[0].length-1;i>=0;i--){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<grid.length;j++){
                max = Math.max(max,grid[j][i]);
            }
            list.add(max);
        }
        
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
}