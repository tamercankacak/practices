package algorithms;

public class Practice20220127MergeSortedLists {
  public void main(String[] args) {
    ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null && list2 == null) {
      return null;
    }
    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }
    ListNode result = new ListNode(0);
    ListNode prev = result;
    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        prev.next = list1;
        list1 = list1.next;
      } else {
        prev.next = list2;
        list2 = list2.next;
      }
      prev = prev.next;
    }
    if (list1 != null) {
      prev.next = list1;
    }
    if (list2 != null) {
      prev.next = list2;
    }
    return result.next;
  }

  public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
