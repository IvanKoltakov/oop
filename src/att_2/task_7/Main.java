package att_2.task_7;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>();
        linkedList.add(5);
        linkedList.addFirst(2);
        linkedList.add(4);
        linkedList.printList();
        System.out.println(linkedList.getSize());
        linkedList.remove(4);
        linkedList.printList();
        System.out.println(linkedList.getSize());
    }
}
