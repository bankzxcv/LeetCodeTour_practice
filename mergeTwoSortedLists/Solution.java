public class Solution {
  public static void main(String[] args) {
    ListNode a = new ListNode(5, new ListNode(7, new ListNode(10, new ListNode(40))));
    ListNode b = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(9))));
    ListNode c = new ListNode(41);
    ListNode d = new ListNode(6);
    ListNode e = new ListNode();
    // printList(b);
    int bb = 1;
    ListNode m = mergeTwoLists(c, d);
    printList(m);
  }

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if(list1 == null) return list2;
    if(list2 == null) return list1;
    ListNode dummy = new ListNode();
    ListNode tail = dummy;

    while (list1 != null && list2 != null) {

      if (list1.val < list2.val) {
        tail.next = list1;
        list1 = list1.next;
      } else {
        tail.next = list2;
        list2 = list2.next;
      }
      tail = tail.next;

      if (list1 == null) {
        tail.next = list2;
      }
      if (list2 == null) {
        tail.next = list1;
      }
    }

    return dummy.next;
  }

  public static void printList(ListNode list) {
    ListNode curr = list;
    while (curr != null) {
      System.out.println(curr.val);
      curr = curr.next;
    }
  }
}

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