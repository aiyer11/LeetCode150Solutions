package com.arjun.interviewprep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ValidSudokuSolution {

    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Set<Character>> rows = new HashMap<>();
        HashMap<Integer, Set<Character>> cols = new HashMap<>();
        HashMap<Integer, Set<Character>> boxes = new HashMap<>();

        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                if(board[i][j] == '.')
                {
                    continue;
                }

                if(rows.getOrDefault(i,new HashSet<>()).contains(board[i][j]))
                {
                    return false;
                }

                if(cols.getOrDefault(j,new HashSet<>()).contains(board[i][j]))
                {
                    return false;
                }

                if(boxes.getOrDefault((i / 3) * 3 + (j/3),new HashSet<>()).contains(board[i][j])){
                    return false;
                }

                rows.computeIfAbsent(i,t -> new HashSet<>()).add(board[i][j]);
                cols.computeIfAbsent(j,t -> new HashSet<>()).add(board[i][j]);
                boxes.computeIfAbsent((i / 3) * 3 + (j/3),t -> new HashSet<>()).add(board[i][j]);
            }
        }
        return true;
    }
}
