package algorithm.easy;

import java.util.List;

/**
 * Description of file goes here
 *
 * @author Ali Sadeghi
 * Created at 2023/08/21 - 10:00 PM
 */
public class _21MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));

        ListNode node = new _21MergeTwoSortedLists().mergeTwoLists(node1, node2);
        System.out.println("node = " + node);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode current = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        return head.next;
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