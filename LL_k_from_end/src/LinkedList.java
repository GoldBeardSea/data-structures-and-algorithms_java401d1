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

        public void append(int value) {
            ListNode appendingNode = new ListNode(value);
            appendingNode.next = head;
            head = appendingNode;
        }

}
