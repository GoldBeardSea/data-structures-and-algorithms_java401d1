    public class Main {
        public static void main(String[] args) {

            LinkedList ll = new LinkedList();
            ListNode n1 = new ListNode(1);
            ListNode n2 = new ListNode(7);
            ListNode n3 = new ListNode(2);
            ListNode n4 = new ListNode(3);
            ListNode n5 = new ListNode(5);

            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = n5;
            n5.next = n2;
            ll.root = n1;

            ll.hasLoop();
            System.out.println();

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

            bb.root = b1;
            bb.hasLoop();

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
            a13.next = a2;

            aa.root = a1; // attach n1 as the root manually.
            aa.hasLoop();



        }
}
