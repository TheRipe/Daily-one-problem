class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] sort = new int[mat.length][2];
        int index=0;
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1)count++;
                else break;
            }
            sort[i] = new int[]{count,i};
        }
        Arrays.sort(sort,new Comparator<int[]>(){
            public int compare(int[] e1,int[] e2){
                if(e1[0]!=e2[0]) return e1[0]-e2[0];
                else return e1[1]-e2[1];
            }
        });
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=sort[i][1];
        }
        return ans;
    }
}

