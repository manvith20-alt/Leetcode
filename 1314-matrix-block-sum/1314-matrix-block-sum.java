class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m= mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                for(int g=i-k;g<=i+k;g++){
                    for(int h=j-k;h<=j+k;h++){
                        if(g >= 0 && g < m && h >= 0 && h < n){
                            ans[i][j] += mat[g][h]; 
                        
                        }

                    }
                }
            }
        }

                return ans;
   }
}