package LeetCode;

public class PalindromeLinkedList234 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {

        if ( head == null || head.next == null ) {

            return true;

        }

//         find the center of LinkedList

        ListNode slow = head, fast = head;

        while ( fast.next != null && fast.next.next != null ){

            slow = slow.next;
            fast = fast.next.next;

        }

//         reverse the LinkedList from next of slow

        slow.next = reverse(slow.next);

        slow = slow.next;

//         now while travesing check if first and second half of linkedList are same
        while ( slow != null ){

            if ( head.val != slow.val ){

                return false;

            }

            head = head.next;

            slow = slow.next;

        }

        return true;

    }

    ListNode reverse ( ListNode head ){

        ListNode prev = null;

        while ( head != null ){

            ListNode node = head.next;

            head.next = prev;

            prev = head;

            head = node;

        }

        return prev;

    }
}
