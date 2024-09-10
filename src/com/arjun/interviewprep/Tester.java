package com.arjun.interviewprep;

public class Tester {
    public static void main(String[] args){
        char[][]board = {{'1','2','.','.','3','.','.','.','.'},
                        {'4','.','.','5','.','.','.','.','.'},
                        {'.','9','1','.','.','.','.','.','3'},
                        {'5','.','.','.','6','.','.','.','4'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','.','.','.','.','.','2','.','.'},
                        {'.','.','.','4','1','9','.','.','8'},
                        {'.','.','.','.','8','.','.','7','9'}};

        ValidSudokuSolution solution = new ValidSudokuSolution();
        System.out.println(solution.isValidSudoku(board));
    }
}
