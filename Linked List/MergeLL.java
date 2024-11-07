public class MergeLL{

    public static class Node{ 
            int data;
            Node next;
            public Node(int data){
                this.data = data;
                this.next = null;
            }
        
    }

    public static Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 !=null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next =head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }
        while(head2 != null){
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }
        return mergedLL.next;
    }

    public Node mergesort(Node head){
        while(head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);

        //lefthalf and righthalf
        Node rightHead = mid.next;
        mid.next = null;
        Node head1 = mergesort(head);
        Node head2 = mergesort(rightHead);

        //merge
        return merge(head1,head2);
    }


    public void printll(){  //O(n)
        if(head == null){
            System.out.println("EMPTY");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public static void main(String args[]){
        MergeLL ll = new MergeLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        // ll.addFirst(6);
        ll.printll();
        head = ll.mergesort(ll.head);
        ll.printll();
    }
}