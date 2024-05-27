class Solution {
    public void rotate(int[][] matrix) {
        int[] temp=new int[matrix[0].length*matrix.length];
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                temp[count]=matrix[i][j];
                count++;
            }
        }
        count=0;
        for(int j=matrix[0].length-1;j>=0;j--){
            for(int i=0;i<matrix.length;i++){
                matrix[i][j]=temp[count];
                count++;
            }
        }
    }
}