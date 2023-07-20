/**
 * Sol
 */
public class Sol {
  public static void main(String[] args) {
  }

  public static void reverseString(char[] s) {
    int len = s.length;
    for (int i = 0; i < len / 2; i++) {
      char tmp = s[i];
      // swap
      s[i] = s[len - i - 1];
      s[len - i - 1] = tmp;
    }

  }
}