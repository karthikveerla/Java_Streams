package com.example.CodeCamp;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
public static boolean isValidSudoku(char[][] su){
    int n = 9;
    HashSet<Character>[] row = new HashSet[n];
    HashSet<Character>[] col = new HashSet[n];
    HashSet<Character>[] box = new HashSet[n];
    for(int i =0;i<n;i++){
        row[i] = new HashSet<Character>();
        col[i] = new HashSet<Character>();
        box[i] = new HashSet<Character>();
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            char c = su[i][j];
            if(c =='.'){
                continue;
            }
            if(row[i].contains(c)){
                return false;
            }
            row[i].add(c);
            if(col[j].contains(c)){
                return false;
            }
            col[j].add(c);
            int b = i/3 * 3 + j/3;
            if(box[b].contains(c)){
                return false;
            }
            box[b].add(c);
        }
    }
    return true;
}

    public static void main(String[] args) {
    char[][] su = {
    {'5','3','.','.','7','.','3','.','.'},
    {'6','.','.','1','9','5','.','.','.'},
    {'.','9','8','.','.','.','.','6','.'},
    {'8','.','.','.','6','.','.','.','3'},
    {'4','.','.','8','.','3','.','.','1'},
    {'7','.','.','.','2','.','.','.','6'},
    {'.','6','.','.','.','.','2','8','.'},
    {'.','.','.','4','1','9','.','.','5'},
    {'.','.','.','.','8','.','.','7','9'}
    };
    System.out.println(isValidSudoku(su));
    }
}
