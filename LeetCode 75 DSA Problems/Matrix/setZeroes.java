class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] zerorow=new boolean[matrix.length];
        boolean[] zerocoloum=new boolean[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    zerorow[i]=true;
                    zerocoloum[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(zerorow[i] || zerocoloum[j]){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}