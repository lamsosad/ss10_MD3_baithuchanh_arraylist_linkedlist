package bai2_linkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        System.out.println("****************TESTING********************");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(1);
        ll.add(3,999);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();

    }
}
