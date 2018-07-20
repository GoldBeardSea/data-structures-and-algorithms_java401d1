public class LinkedList {
    public ListNode root;
    public ListNode current;

    public LinkedList() {
        this.root = null;
    }

    public void prepend(int data) {
        ListNode nn = new ListNode(data);
        nn.next = this.root;
        this.root = nn;
    }

    public void append(int val) {
        ListNode temp = new ListNode(val);
        ListNode head = this.root;
        if (head == null) {
            head = temp;
            return;
        }
        ListNode end = new ListNode(0);
        end.next = null;
        ListNode last = head;
        while (last.next != null) {
            last.next = temp;
            return;
        }
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void insertBefore(int value, int newVal) {
        // received help from ahmed
        try {
            ListNode nodeValue = new ListNode(value);
            ListNode newValue = new ListNode(newVal);
            ListNode current = this.root;

            while (current.data != value) {
                current = current.next;
            }
            newValue.next = current.next;
            current.next = newValue;
        } catch (NullPointerException e) {
            System.out.println("You have reached the end of the list.");
        }
    }

    public void insertAfter(ListNode targetNode, int insertVal) {
        if (targetNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        ListNode insertedNode = new ListNode(insertVal);
        insertedNode.next = targetNode.next;
        targetNode.next = insertedNode;
    }

    public int size() {
        int total = 0;

        ListNode current = this.root;
        while (current != null) {
            total++;
            current = current.next;
        }
        return total;
    }

    public void printList() {
        if (root == null) {
            System.out.println("<");
            System.out.println(">");
        } else {
            ListNode temp = root;
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

