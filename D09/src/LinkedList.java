public class LinkedList {
        public ListNode root;
        public ListNode current;

        public LinkedList() {
            this.root = null;
        }

        public boolean hasLoop() {
                ListNode tortise, hare;
                tortise = this.root;
                hare = this.root;
                    if (tortise == null && hare == null) {
                        System.out.println("List is Empty");
                        return false;
                    }
                while (true) {
                    tortise = tortise.next;

                    if (hare.next != null) {
                        hare = hare.next.next;
                    } else {
                        System.out.println("List is not circular, null found");
                        return false;
                    }
                    if (tortise == hare) {
                        System.out.println("Tortise has caught hare");
                        return true;
                    }

            }
        }
}
