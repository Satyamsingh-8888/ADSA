public class DetectCycle {

    public static class ListNode {
        int data;
        ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == null || head.next == null) {
            return false;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DetectCycle dc = new DetectCycle();

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        // Create cycle: 1 -> 2 -> 3 -> 4 -> 2 ...
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        if (dc.hasCycle(n1)) {
            System.out.println("Cycle detected!");
        } else {
            System.out.println("No cycle.");
        }
    }
}
