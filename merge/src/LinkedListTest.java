import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @org.junit.jupiter.api.Test
    void mergeLinkedList() {
        LinkedList first = new LinkedList();
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(2);

        LinkedList second = new LinkedList();
        ListNode a1 = new ListNode(5);
        ListNode a2 = new ListNode(9);
        ListNode a3 = new ListNode(4);

        b1.next = b2;
        b2.next = b3;
        b3.next = null;
        a1.next = a2;
        a2.next = a3;
        a3.next = null;
        second.head = a1;
        first.head = b1;
        first.printList();
        second.printList();
        LinkedList test = new LinkedList();
        test = test.mergeLinkedList(first, second);
        LinkedList expected = new LinkedList();
        b1.next = a1;
        a1.next = b2;
        b2.next = a2;
        a2.next = b3;
        b3.next = a3;
        a3.next = null;
        expected.head = b1;
        test.printList();
        expected.printList();
    }
    @org.junit.jupiter.api.Test
    void mergeLinkedListTopOff() {
        LinkedList first = new LinkedList();
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(2);
        ListNode b4 = new ListNode(7);
        LinkedList second = new LinkedList();
        ListNode a1 = new ListNode(5);
        ListNode a2 = new ListNode(9);
        ListNode a3 = new ListNode(4);
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = null;
        a1.next = a2;
        a2.next = a3;
        a3.next = null;
        second.head = a1;
        first.head = b1;
        first.printList();
        second.printList();

        LinkedList test = new LinkedList();
        test = test.mergeLinkedList(first, second);
        LinkedList expected = new LinkedList();
        b1.next = a1;
        a1.next = b2;
        b2.next = a2;
        a2.next = b3;
        b3.next = a3;
        a3.next = b4;
        b4.next = null;
        expected.head = b1;
        test.printList();
        expected.printList();
    }
    @org.junit.jupiter.api.Test
    void mergeLinkedListBotOff() {
        LinkedList first = new LinkedList();
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(2);
        LinkedList second = new LinkedList();
        ListNode a1 = new ListNode(5);
        ListNode a2 = new ListNode(9);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(8);
        b1.next = b2;
        b2.next = b3;
        b3.next = null;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = null;
        second.head = a1;
        first.head = b1;
        first.printList();
        second.printList();

        LinkedList test = new LinkedList();
        test = test.mergeLinkedList(first, second);
        LinkedList expected = new LinkedList();
        b1.next = a1;
        a1.next = b2;
        b2.next = a2;
        a2.next = b3;
        b3.next = a3;
        a3.next = a4;
        a4.next = null;
        expected.head = b1;
        test.printList();
        expected.printList();
    }
}