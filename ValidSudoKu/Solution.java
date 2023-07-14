import java.util.*;
import java.math.*;

public class Solution {
  public static void main(String args[]) {
    char[][] boardA = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
        { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
        { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };

    char[][] boardB = { { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
        { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
        { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };

    System.out.println(isValidSudoku(boardA));
    System.out.println(isValidSudoku(boardB));
  }

  public static boolean isValidSudoku(char[][] board) {
    Set<String> seen = new HashSet<String>();

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        // System.out.println(board[i][j]);
        if (board[i][j] == '.')
          continue;
        int num = board[i][j] - '0';
        String A = "r_" + i;
        String B = "c_" + j;
        String C = "g_" + Math.round(i / 3) + "" + Math.round(j / 3);
        if (seen.contains(A + num) || seen.contains(B + num) || seen.contains(C + num)) {
          return false;
        }
        seen.add(A + num);
        seen.add(B + num);
        seen.add(C + num);
      }
    }
    return true;
  }
}
