import java.util.LinkedList; //JCF -> optimised codes

public class Inbuilt {
    public static void main(String args[]){
        // no primitive data types only classes like Integer , Float, Character...etc..
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(0);
        // 0->1->2->3
        System.out.println(ll);

        //removing elements of ll
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }    
}
