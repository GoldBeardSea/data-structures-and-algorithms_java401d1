import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @org.junit.jupiter.api.Test
    void isCircularEmptyList() {
        LinkedList aa = new LinkedList();
        ListNode a1 = new ListNode(10);
        ListNode a2 = new ListNode(10);
        ListNode a3 = new ListNode(10);
        ListNode a4 = new ListNode(3);
        ListNode a5 = new ListNode(5);
        ListNode a6 = new ListNode(15);
        ListNode a7 = new ListNode(18);
        ListNode a8 = new ListNode(19);
        ListNode a9 = new ListNode(120);
        ListNode a10 = new ListNode(110);
        ListNode a11 = new ListNode(1010);
        ListNode a12 = new ListNode(10000);
        ListNode a13 = new ListNode(100000);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;
        a7.next = a8;
        a8.next = a9;
        a9.next = a10;
        a10.next = a11;
        a11.next = a12;
        a12.next = a13;
        boolean test = aa.hasLoop();
        assertFalse(test);


    }
    @org.junit.jupiter.api.Test
    void isCircularNonLoop() {
        LinkedList aa = new LinkedList();
        ListNode a1 = new ListNode(10);
        ListNode a2 = new ListNode(10);
        ListNode a3 = new ListNode(10);
        ListNode a4 = new ListNode(3);
        ListNode a5 = new ListNode(5);
        ListNode a6 = new ListNode(15);
        ListNode a7 = new ListNode(18);
        ListNode a8 = new ListNode(19);
        ListNode a9 = new ListNode(120);
        ListNode a10 = new ListNode(110);
        ListNode a11 = new ListNode(1010);
        ListNode a12 = new ListNode(10000);
        ListNode a13 = new ListNode(100000);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;
        a7.next = a8;
        a8.next = a9;
        a9.next = a10;
        a10.next = a11;
        a11.next = a12;
        a12.next = a13;
        aa.root = a1;
        boolean test = aa.hasLoop();
        assertFalse(test);

    }
    @org.junit.jupiter.api.Test
    void isCircularLongLoop() {
        LinkedList aa = new LinkedList();
        ListNode a1 = new ListNode(10);
        ListNode a2 = new ListNode(10);
        ListNode a3 = new ListNode(10);
        ListNode a4 = new ListNode(3);
        ListNode a5 = new ListNode(5);
        ListNode a6 = new ListNode(15);
        ListNode a7 = new ListNode(18);
        ListNode a8 = new ListNode(19);
        ListNode a9 = new ListNode(120);
        ListNode a10 = new ListNode(110);
        ListNode a11 = new ListNode(1010);
        ListNode a12 = new ListNode(10000);
        ListNode a13 = new ListNode(100000);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;
        a7.next = a8;
        a8.next = a9;
        a9.next = a10;
        a10.next = a11;
        a11.next = a12;
        a12.next = a13;
        aa.root = a1;
        a13.next = a2;
        boolean test = aa.hasLoop();
        assertTrue(test);
    }
}