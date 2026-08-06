package Core.CollectionsFramework.LinkedList.CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(10,0);
        list.display();
        list.addFirst(20);
        list.display();
        list.addLast(30);
        list.display();

        list.removeFirst();
        list.display();

        list.removeLast();
        list.display();

    }
}
