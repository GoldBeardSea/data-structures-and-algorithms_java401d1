import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @org.junit.jupiter.api.Test
    void kthFromEndOne() {
        LinkedList testList = new LinkedList();
        testList.prepend(40);
        testList.prepend(10);
        testList.prepend(19);
        testList.prepend(13);
        testList.prepend(15);
        testList.prepend(222);
        ListNode test = testList.kthFromEnd(5);
        testList.printList();
        assertEquals(15, test.data);
    }

    @org.junit.jupiter.api.Test
    void kthFromEndKthLongerThanList() {
        LinkedList testList = new LinkedList();
        testList.prepend(40);
        testList.prepend(10);
        testList.prepend(19);
        testList.prepend(13);
        testList.prepend(15);
        testList.prepend(222);
        ListNode test = testList.kthFromEnd(10);
        testList.printList();
        assertEquals(222, test.data);
    }

    @org.junit.jupiter.api.Test
    void kthFromEndKthEmptyList() {
        LinkedList testList = new LinkedList();
        ListNode test = testList.kthFromEnd(5);
        testList.printList();
        assertNull(test);
    }


}