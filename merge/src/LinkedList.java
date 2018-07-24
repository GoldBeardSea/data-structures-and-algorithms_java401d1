public class LinkedList {
    ListNode head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList mergeLinkedList(LinkedList one, LinkedList two) {
        ListNode first = one.head;
        ListNode firstTemp = one.head.next;

        ListNode second = two.head;
        ListNode secondTemp = two.head.next;

        if (first == null && second != null) {
            return two;
        }
        if (second == null && first != null) {
            return one;
        }
        while (firstTemp != null && secondTemp != null) {
            first.next = second;
            second.next = firstTemp;
            first = firstTemp;
            second = secondTemp;
            firstTemp = firstTemp.next;
            secondTemp = secondTemp.next;
        }

        if (first.next != second) {
            first.next = second;
        }

        if (first.next == null) {
            first.next = second;
        }
        if (second.next == null) {
            second.next = secondTemp;
        }
        return one;
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