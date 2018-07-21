public class LinkedList {
    public ListNode root;
    public static ListNode head;

    public LinkedList() {
        this.root = null;
    }

    public ListNode reverseList(ListNode start) {
        ListNode prev = null;
        ListNode current = start;
        ListNode next = null;
        if (start == null) {
            System.out.println("List is Empty");
            return start;
        }
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        start = prev;
        return start;
    }

    public void printList(ListNode start) {
        if (start == null) {
            System.out.println("<");
            System.out.println(">");
        } else {
            ListNode temp = start;
            System.out.println("<");
            while (temp != null) {
                if (temp == this.root) {
                    System.out.print("[" + temp.data + "]" + "-->");
                } else {
                    System.out.print("[" + temp.data + "]");
                    System.out.print("-->");
                }
                temp = temp.next;
            }
            System.out.println("[end]>");
        }
    }
}