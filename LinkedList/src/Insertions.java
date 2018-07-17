public class Insertions {
    ListNode root;

    public LinkedList() {
        this.root = null;
    }

    public void append(int val) {
        ListNode temp = new ListNode(val);
        ListNode head = this.root;
        if (head == null) {
            head = temp;
            return;
        }
        ListNode end = new ListNode;
        end.next = null;
        ListNode last = head;
        while (last.next != null) {
            last.next = temp;
            return;
        }
    }
}