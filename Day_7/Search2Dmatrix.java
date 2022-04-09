class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        boolean search= false;
        int i,row=-1;
        for(i=0; i<matrix.length; i++)
        {
            if(target>=matrix[i][0] && target<=matrix[i][matrix[0].length-1])
            {
                row=i;
                break;
            }
        }
        if(row!= -1)
        {
            for(i=0; i<matrix[0].length; i++)
            {
                if(matrix[row][i]==target)
                    search=true;
            }
            
        }
        return search;
    }
}
