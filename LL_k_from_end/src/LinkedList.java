public class LinkedList {
        ListNode head;

        public LinkedList() {
            this.head = null;
        }

        public ListNode kthFromEnd(int k) {
            int length = 0;
            ListNode focalNode = head;
            if (head == null) {
                System.out.println("List is Empty");
                return head;
            }
            while (focalNode != null) {
                focalNode = focalNode.next;
                length++;
            }
            if (length < k) {
                System.out.println("Value is longer than list");

                return head;
            }
            focalNode = head;
            for (int i = 1; i < length - k + 1; i++) {
                focalNode = focalNode.next;
            }

            return focalNode;
        }

        public void prepend(int value) {
            ListNode appendingNode = new ListNode(value);
            appendingNode.next = head;
            head = appendingNode;
        }

    public void printList() {
        if (head == null) {
            System.out.println("<");
            System.out.println(">");
        } else {
            ListNode temp = head;
            System.out.print("<");
            while (temp != null) {
                if (temp == this.head) {
                    System.out.print("[" + temp.data + "]" + "-->");
                } else {
                    System.out.print("[" + temp.data + "]");
                    System.out.print("-->");
                }
                temp = temp.next;
            }
            System.out.println("[null]");
        }
    }

}
