class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int leftPointer = 0; //0
        int rightPointer = numRows - 1; //2
        int row = -1;
        if(target < matrix[0][0] || target > matrix[numRows-1][numCols-1]) {
            return false;
        }
        while(leftPointer <= rightPointer) {
            int mid = leftPointer + (rightPointer - leftPointer)/2; //1
            if(matrix[mid][0] <= target && matrix[mid][numCols-1] >= target) {
                row = mid;
                break;
            } else if(matrix[mid][numCols - 1] < target) {
                leftPointer = mid+1; // 1,2
            } else if(matrix[mid][0]> target) {
                rightPointer = mid-1;
            }
        }
        if (row == -1) {
            return false;
        }

        int leftColPointer = 0;
        int rightColPointer = numCols -1;
        while(leftColPointer <= rightColPointer) {
            int midCol = leftColPointer + (rightColPointer - leftColPointer)/2;
            if(matrix[row][midCol] == target) {
                return true;
            } else if(matrix[row][midCol] > target) {
                rightColPointer = midCol - 1;
                
            } else {
                leftColPointer = midCol + 1;
            }

        }
        return false;
        
    }
}
