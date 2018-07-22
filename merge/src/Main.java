public class Main {
    public static void main(String[] args) {
        LinkedList first = new LinkedList();
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(2);
//        ListNode b4 = new ListNode(7);
//        ListNode b5 = new ListNode(9);
        LinkedList second = new LinkedList();
        ListNode a1 = new ListNode(5);
        ListNode a2 = new ListNode(9);
        ListNode a3 = new ListNode(4);
//        ListNode a4 = new ListNode(8);
//        ListNode a5 = new ListNode(10);

        b1.next = b2;
        b2.next = b3;
        b3.next = null;
//        b4.next = b5;
//        b5.next = null;
        a1.next = a2;
        a2.next = a3;
        a3.next = null;
//        a4.next = a5;
//        a5.next = null;
        second.head = a1;
        first.head = b1;
        first.printList();
        second.printList();
        first.mergeLinkedList(first, second);
//        first.printList();
    }
}
