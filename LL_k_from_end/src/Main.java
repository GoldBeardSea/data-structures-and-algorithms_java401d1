public class Main {
    public static void main(String[] args) {
        LinkedList testList = new LinkedList();
        testList.prepend(40);
        testList.prepend(10);
        testList.prepend(19);
        testList.prepend(13);
        testList.prepend(15);
        testList.prepend(222);

        ListNode test = testList.kthFromEnd(5);
        System.out.println(test.data);

    }
}
