import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @org.junit.jupiter.api.Test
    void kthFromEndOne() {
        LinkedList testList = new LinkedList();
        testList.append(40);
        testList.append(10);
        testList.append(19);
        testList.append(13);
        testList.append(15);
        testList.append(222);
        ListNode test = testList.kthFromEnd(5);
        assertEquals(15, test.data);
    }

    @org.junit.jupiter.api.Test
    void kthFromEndKthLongerThanList() {
        LinkedList testList = new LinkedList();
        testList.append(40);
        testList.append(10);
        testList.append(19);
        testList.append(13);
        testList.append(15);
        testList.append(222);
        ListNode test = testList.kthFromEnd(10);
        assertEquals(222, test.data);
    }

    @org.junit.jupiter.api.Test
    void kthFromEndKthEmptyList() {
        LinkedList testList = new LinkedList();
        ListNode test = testList.kthFromEnd(5);
        assertNull(test);
    }


}