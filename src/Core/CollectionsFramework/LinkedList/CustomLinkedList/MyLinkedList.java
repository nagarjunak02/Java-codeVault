package Core.CollectionsFramework.LinkedList.CustomLinkedList;



public class MyLinkedList {
    Node head;
    Node tail;
    int size;

    MyLinkedList(){

    }

    public void addFirst(int val){

        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }


    public void addLast(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void add(int val,int index){
        Node newNode = new Node(val);
        if(index==0){

            addFirst(val);

            return;

        }
        if(index == size){
            addLast(val);
            return;
        }
        if(index<0 || index>size){
            System.out.println("Index out of range..");
            return;
        }

        Node temp = head;
        for(int i = 0; i<index-1;i++) {
            temp = temp.next;
        }

            newNode.next = temp.next;
            temp.next = newNode;
            size++;
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        size--;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("Empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }

        Node temp = head;
        for(int i =0;i<size-2;i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

//    public void removeFirst();

    public void display(){
        if(head == null){
            System.out.println("Empty..");
            return;
        }

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+" -> "    );
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
