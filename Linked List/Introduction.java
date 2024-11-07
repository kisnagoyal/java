public class Introduction{

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size; // java will automatically assign zero value;

    public void addFirst(int data){
        //step 1 
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2
        newNode.next = head;
        // step 3
        head = newNode;
    }

    public void addLast(int data){
        //step 1
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2
        tail.next = newNode;
        //step 3
        tail = newNode;
    }

    public void addMiddle(int data,int index){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data); 
        size++;
        Node temp = head;
        int i = 0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
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

    public int  removeFirst(){
        if(size == 0){
            System.out.println("Empty linked list");
        }
        else if(size ==1){
            int val = head.data;
            head= tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int  removeLast(){
        if(size == 0){
            System.out.println("Empty linked list");
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev = size -2;
        Node prev = head;
        for(int i = 0;i< size-2;i++){
            prev = prev.next;
        }

        int val = prev.next.data; //data of tail
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static int searchKey(int key){ //O(n)
       int i = 0;
       Node temp = head;
       while(temp != null){
        if(temp.data == key){
            return i;
        }
        temp = temp.next;
        i++;
       } 
       return -1;
    }

    public static int helper(Node head,int key){ //O(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index = helper(head.next, key);
        if(index == -1){
            return -1;
        }
        else{
            return index + 1;
        }
    }

    public static int searchRecursion(int key){
        return helper(head, key);
    }


    public static void Reverse(){ //O(n)
        Node curr = tail = head;
        Node prev = null;
        Node next = curr.next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }



    public static void deleteNthFromEnd(int n){
        //to calculate size 
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }

        //method 2

        if(n == size){
            head = head.next;
            return;
        }
        //sz - n
        int i = 1;
        int itofind = sz - n;
        Node prev = head;
        while(i < itofind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;


    }
//slow fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // step 1 - finding mid
        Node mid = findMid(head);

        //step 2 - reversing 2nd half
        Node curr = mid;
        Node prev = null;
        Node next = curr.next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev; // head of 2nd half

        // checking left half and right half
        while(right!= null){
            if(left.data != right.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    public static void main(String args[]){
        Introduction ll = new Introduction();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printll();
        System.out.println(ll.isPalindrome());
        
    }
}