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
    int i = 0;
    ListNode node = head;
    Map<Integer, ListNode> m = new HashMap<Integer, ListNode>();
    while (node != null) {
      i++;
      m.put(i, node);
      node = node.next;
    }
    if (i == 0) {
      return head;
    }
    int pos = i - n + 1;
    int prevPos = i - n;
    ListNode curNode = m.get(pos);
    if (prevPos == 0) {
      head = head.next;
    } else {
      ListNode preNode = m.get(prevPos);
      preNode.next = curNode.next;
    }
    curNode = null;
    return head;
  }
}
