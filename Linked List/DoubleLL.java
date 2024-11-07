public class DoubleLL{
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null; 
        }
    }
    public static  Node head;
    public static Node tail;
    public static int size;
    
    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head== null){
            head = tail = newNode ;
            return;
        }
        newNode.next = head;
        head = newNode;
        newNode.prev = null;
        return;
    }

    public static void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head== null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        
    }

    public static void removelast(){
        if(head == null){
            System.out.println("DOuble linked list is empty");
            return;
        }
        size--;
        tail.prev.next = null;
        tail.prev = tail;
    }

    public static void removeFirst(){
        if(head == null){
            System.out.println("DOuble linked list is empty");
            return;
        }
        size--;
        head.next.prev = null;
        head = head.next;
    }

    public static void reversedll(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void printdll(){
        Node temp = head;
        if(temp == null){
            System.out.println("double linked list is empty");
        }
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next; 
        }
        System.out.print("null");
        return;
    }



    public static void main(String args[]){
        DoubleLL dll = new DoubleLL();
        addFirst(20);
        addFirst(10);
        addlast(15);
        addlast(12);
        // removelast();
        // removeFirst();
        printdll();
        System.out.println("\n size is "+ size);
        reversedll();
        printdll();
    }
}