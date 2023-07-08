import java.io.*;
import java.util.*;

public class Roman {
  public static void main(String[] args) {
    System.out.println(romanToInt("MCMXCIV"));
    System.out.println(romanToInt("III"));
    System.out.println(romanToInt("LVIII"));
    System.out.println(romanToInt("MCMXCIV"));
  }

  public static int romanToInt(String s) {
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int tmp = getVal(c);
      sum += tmp;
      if (i > 0) {
        int prev = getVal(s.charAt(i - 1));
        if (tmp > prev) {
          sum -= prev*2;
        }
      }
    }
    return sum;
  }

  public static int getVal(char c) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    return map.get(c);
  }
}
