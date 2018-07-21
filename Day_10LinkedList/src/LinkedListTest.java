import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @org.junit.jupiter.api.Test
    void reverseListTestOne() {
        LinkedList bb = new LinkedList();
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(7);
        ListNode b3 = new ListNode(2);
        ListNode b4 = new ListNode(3);
        ListNode b5 = new ListNode(5);
        ListNode b6 = new ListNode(15);
        ListNode b7 = new ListNode(18);
        ListNode b8 = new ListNode(19);
        ListNode b9 = new ListNode(120);
        ListNode b10 = new ListNode(110);
        ListNode b11 = new ListNode(1010);
        ListNode b12 = new ListNode(10000);
        ListNode b13 = new ListNode(100000);
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;
        b5.next = b6;
        b6.next = b7;
        b7.next = b8;
        b8.next = b9;
        b9.next = b10;
        b10.next = b11;
        b11.next = b12;
        b12.next = b13;
        bb.head = b1;
        bb.printList(bb.head);
        bb.head = bb.reverseList(bb.head);
        bb.printList(bb.head);
        assertEquals(100000, bb.head.data);
    }
    @org.junit.jupiter.api.Test
    void reverseListTestTwo() {
        LinkedList bb = new LinkedList();
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(7);
        ListNode b3 = new ListNode(2);
        ListNode b4 = new ListNode(0);
        ListNode b5 = new ListNode(5);
        ListNode b6 = new ListNode(15);
        ListNode b7 = new ListNode(4);
        ListNode b8 = new ListNode(19);
        ListNode b9 = new ListNode(3);
        ListNode b10 = new ListNode(110);
        ListNode b11 = new ListNode(0);
        ListNode b12 = new ListNode(2);
        ListNode b13 = new ListNode(0);
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;
        b5.next = b6;
        b6.next = b7;
        b7.next = b8;
        b8.next = b9;
        b9.next = b10;
        b10.next = b11;
        b11.next = b12;
        b12.next = b13;
        bb.head = b1;
        bb.printList(bb.head);
        bb.head = bb.reverseList(bb.head);
        bb.printList(bb.head);
        assertEquals(0, bb.head.data);
    }
    @org.junit.jupiter.api.Test
    void reverseListTestThree() {
        LinkedList bb = new LinkedList();
        ListNode b1 = new ListNode(1000);
        ListNode b2 = new ListNode(7);
        ListNode b3 = new ListNode(2);
        ListNode b4 = new ListNode(-10);
        ListNode b5 = new ListNode(5);
        ListNode b6 = new ListNode(34);
        ListNode b7 = new ListNode(4);
        ListNode b8 = new ListNode(19);
        ListNode b9 = new ListNode(40);
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;
        b5.next = b6;
        b6.next = b7;
        b7.next = b8;
        b8.next = b9;
        bb.head = b1;
        bb.printList(bb.head);
        bb.head = bb.reverseList(bb.head);
        bb.printList(bb.head);
        assertEquals(40, bb.head.data);
    }
}

//    @org.junit.jupiter.api.Test
//    void reverseListTestEmpty() {
//        LinkedList bb = new LinkedList();
//        ListNode b1 = null;
//        bb.head = b1;
//        bb.head = bb.reverseList(bb.head);
//// Can't seem to figure this out
//    }