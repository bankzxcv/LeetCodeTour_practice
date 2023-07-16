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

public class SolutionBetter {
  public static void main(String[] args) {
    int[] x = { 1, 2, 3, 4, 5, 6 };
    ListNode curr = new ListNode(x[0]);
    ListNode head = curr;
    for (int i = 1; i < x.length; i++) {
      ListNode tmp = new ListNode(x[i]);
      curr.next = tmp;
      curr = curr.next;
    }
    removeNthFromEnd(head, 1);
  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode ptr = new ListNode();
    ptr.next = head;
    ListNode fast = ptr;
    ListNode slow = ptr;

    for (int i = 0; i < n; i++) {
      fast = fast.next;
    }

    while (fast.next != null) {
      fast = fast.next;
      slow = slow.next;
    }

    slow.next = slow.next.next;
    return ptr.next;
  }
}
