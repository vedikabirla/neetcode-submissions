class Solution {
       private HashSet<Character> quad1 = new HashSet<Character>();
       private HashSet<Character> quad2 = new HashSet<Character>();
       private HashSet<Character> quad3 = new HashSet<Character>();
       private HashSet<Character> quad4 = new HashSet<Character>();
       private HashSet<Character> quad5 = new HashSet<Character>();
       private HashSet<Character> quad6 = new HashSet<Character>();
       private HashSet<Character> quad7 = new HashSet<Character>();
       private HashSet<Character> quad8 = new HashSet<Character>();
       private HashSet<Character> quad9 = new HashSet<Character>();

       private HashSet<Character> row1 = new HashSet<Character>();
       private HashSet<Character> row2 = new HashSet<Character>();
       private HashSet<Character> row3 = new HashSet<Character>();
       private HashSet<Character> row4 = new HashSet<Character>();
       private HashSet<Character> row5 = new HashSet<Character>();
       private HashSet<Character> row6 = new HashSet<Character>();
       private HashSet<Character> row7 = new HashSet<Character>();
       private HashSet<Character> row8 = new HashSet<Character>();
       private HashSet<Character> row9 = new HashSet<Character>();

       private HashSet<Character> col1 = new HashSet<Character>();
       private HashSet<Character> col2 = new HashSet<Character>();
       private HashSet<Character> col3 = new HashSet<Character>();
       private HashSet<Character> col4 = new HashSet<Character>();
       private HashSet<Character> col5 = new HashSet<Character>();
       private HashSet<Character> col6 = new HashSet<Character>();
       private HashSet<Character> col7 = new HashSet<Character>();
       private HashSet<Character> col8 = new HashSet<Character>();
       private HashSet<Character> col9 = new HashSet<Character>();

    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9;i++) {
            for(int j = 0;j < 9; j++) {
               if(board[i][j] == '.') {
                    continue;
               }
               char num = board[i][j];
               HashSet<Character> row = getRow(i,j);
               HashSet<Character> col = getCol(i,j);
               HashSet<Character> quad = getQuad(i,j);
               if(row.contains(num) || col.contains(num) || quad.contains(num)) {
                return false;
               } else {
                row.add(num);
                col.add(num);
                quad.add(num);
               }

             }
       }
       return true;
    }

    private HashSet<Character> getQuad(int i, int j) {
        if(i>=0 && i <=2 && j>=0 && j <=2) {
            return quad1;
        }
        if(i>=3 && i <=5 && j>=0 && j <=2) {
            return quad4;
        }
        if(i>=6 && i <=8 && j>=0 && j <=2) {
            return quad7;
        }

        if(i>=0 && i <=2 && j>=3 && j <=5) {
            return quad2;
        }
        if(i>=3 && i <=5 && j>=3 && j <=5) {
            return quad5;
        }
        if(i>=6 && i <=8 && j>=3 && j <=5) {
            return quad8;
        }
        if(i>=0 && i <=2 && j>=6 && j <=8) {
            return quad3;
        }
        if(i>=3 && i <=5 && j>=6 && j <=8) {
            return quad6;
        }
        if(i>=6 && i <=8 && j>=6 && j <=8) {
            return quad9;
        }
        return null;
    }

    private HashSet<Character> getRow(int i, int j) {
        if(i == 0) {
            return row1;
        }
        if(i == 1) {
            return row2;
        }
        if(i == 2) {
            return row3;
        }
          if(i == 3) {
            return row4;
        }
        if(i == 4) {
            return row5;
        }
        if(i == 5) {
            return row6;
        }  if(i == 6) {
            return row7;
        }
        if(i == 7) {
            return row8;
        }
        if(i == 8) {
            return row9;
        }
return null;
       
    }
    private HashSet<Character> getCol(int j, int i) {
        if(i == 0) {
            return col1;
        }
        if(i == 1) {
            return col2;
        }
        if(i == 2) {
            return col3;
        }
          if(i == 3) {
            return col4;
        }
        if(i == 4) {
            return col5;
        }
        if(i == 5) {
            return col6;
        }  if(i == 6) {
            return col7;
        }
        if(i == 7) {
            return col8;
        }
        if(i == 8) {
            return col9;
        }
        return null;

       
    }
}
