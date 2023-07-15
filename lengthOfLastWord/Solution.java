package lengthOfLastWord;

public class Solution {
  public static void main(String[] args) {
  }

  public int lengthOfLastWord(String s) {
    int count = 0;
    for(int i = s.length() -1; i>=0 ;i--) {
        char a = s.charAt(i);
        if (a == ' ' && count > 0) break;
        if ((a >= 'A' && a<= 'Z') || (a >= 'a' && a <= 'z')) count++;
    }
    return count;
}
