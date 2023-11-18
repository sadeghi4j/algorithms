package algorithm.easy;

import java.util.Objects;

/**
  Description of file goes here

  @author Ali Sadeghi
  Created at 2023/11/05 - 9:14 PM
 */
class _2AddTwoNumbers {

    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        while (l1.next != null ) {
            num1.append(l1.val);
        }
        while (l2.next != null) {
            num2.append(l2.val);
        }

        return Integer.valueOf(num1.toString());
    }*/

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        int devision = 0;
        ListNode result = new ListNode();
        ListNode first = result;
        while (l1 != null ) {
            int sum = l2 != null ? l1.val + l2.val + devision : l1.val + devision;
            int mod = sum >= 10 ? sum - 10 : sum;
            devision = sum / 10;
            result.val = mod;
            l1 = l1.next;
            if (l2 != null) {
                l2 = l2.next;
            }
            if (l1 != null) {
                result.next = new ListNode();
                result = result.next;
            }
        }
        if (devision != 0) {
            result.next = new ListNode(devision);

        }
        return first;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int devision = 0;
        ListNode result = new ListNode();
        ListNode first = result;
        while (l1 != null || l2 != null || devision !=0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += devision;

            int mod = sum % 10;
            devision = sum / 10;
//            ListNode node = new ListNode(mod);
//            result.val = mod;
            result.next = new ListNode(mod);
            result = result.next;

        }
        return first.next;
    }

    public static void main(String[] args) {
//        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
//        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(0);
        ListNode node = new _2AddTwoNumbers().addTwoNumbers(node1, node2);
        System.out.println("node = " + node);
    }



}

/*
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return val + ", " + next;
    }
}*/
