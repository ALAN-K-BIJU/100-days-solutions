class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int t = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int k=0; k<matrix.length;k++){
            for(int rot=matrix.length -1, rot2=0; rot2<rot;rot2++,rot--){
                int t=matrix[k][rot2];
                matrix[k][rot2]=matrix[k][rot];
                matrix[k][rot]=t;
            }
        }
    }
}