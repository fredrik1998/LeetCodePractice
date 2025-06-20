package HashmapAndSets;

import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board){
        @SuppressWarnings("unchecked")
        HashSet<Character>[] rows = new HashSet[9];
        @SuppressWarnings("unchecked")
        HashSet<Character>[] cols = new HashSet[9];
        @SuppressWarnings("unchecked")
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int r = 0; r < rows.length; r++){
            for(int c = 0; c < cols.length; c++){
                char val = board[r][c];

                if(val == '.') continue;

                int boxIndex = (r * 3) * 3 + (c / 3);

                if(rows[r].contains(val) || cols[c].contains(val) || boxes[boxIndex].contains(val)){
                    return false;
                }

                rows[r].add(val);
                rows[c].add(val);
                boxes[boxIndex].add(val);
            }
        }
        return true;
    }
}
