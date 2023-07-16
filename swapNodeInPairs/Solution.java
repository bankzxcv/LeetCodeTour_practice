import java.util.*;

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

public class Solution {
  public static void main(String[] args) {
    // int[] x = { 1, 2, 3, 4, 5, 6 };
    int[] x = { 1, 2, 3,4 };
    ListNode curr = new ListNode(x[0]);
    ListNode head = curr;
    for (int i = 1; i < x.length; i++) {
      ListNode tmp = new ListNode(x[i]);
      curr.next = tmp;
      curr = curr.next;
    }

    print(swapPairs(head));
  }

  public static void print(ListNode head) {
    System.out.println("-----");
    ListNode n = head;
    while (n != null) {
      System.out.println(n.val);
      n = n.next;
    }
  }

  static void printNode(ListNode n) {
    System.out.println(n.val);
  }

  public static ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null)
      return head;

    ListNode fast = head.next;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      int temp = fast.val;
      fast.val = slow.val;
      slow.val = temp;

      fast = fast.next.next;
      slow = slow.next.next;
    }
    if (fast != null) {
      int t = fast.val;
      fast.val = slow.val;
      slow.val = t;
    }

    return head;
  }

}
