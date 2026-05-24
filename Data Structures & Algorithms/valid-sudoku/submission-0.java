class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<HashSet<Character>> colSet = new ArrayList<>(9);
        List<HashSet<Character>> rowSet = new ArrayList<>(9);
        List<HashSet<Character>> blockSet = new ArrayList<>(9);

        for(int i=0; i<9;i++){
            colSet.add(new HashSet<>());
            rowSet.add(new HashSet<>());
            blockSet.add(new HashSet<>());
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                Character current = board[i][j];

                if(current<'1'|| current>'9'){
                    continue;
                }

                if(rowSet.get(i).contains(current)){
                    return false;
                }                
                rowSet.get(i).add(current);

                if(colSet.get(j).contains(current)){
                    return false;
                }                 
                colSet.get(j).add(current);

                int blockIndex = (i/3)*3 + (j/3);

                 if(blockSet.get(blockIndex).contains(current)){
                    return false;
                } 
                blockSet.get(blockIndex).add(current);
            }
        }

        return true;

    }
}
