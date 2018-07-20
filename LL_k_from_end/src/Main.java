public class Main {
    public static void main(String[] args) {
        LinkedList testList = new LinkedList();
        testList.append(40);
        testList.append(10);
        testList.append(19);
        testList.append(13);
        testList.append(15);
        testList.append(222);

        LinkedList.ListNode test = testList.kthFromEnd(5);
        System.out.println(test.data);

    }
}
