import java.util.*;

public class BasicHeap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        
        public void add(int data){  //O(log n)
            arr.add(data);

            int x = arr.size()-1; // child index
            int par = (x-1)/2;
            while(arr.get(x) < arr.get(par)){
                //swap
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int min = i;
            int leftchild = 2*i + 1;
            int rightchild = 2*i + 2;

            if(leftchild < arr.size() && arr.get(min) > arr.get(leftchild)){
                min = leftchild;
            }
            if(rightchild < arr.size() && arr.get(rightchild) < arr.get(min)){
                min = rightchild;
            }
            if(min != i){
                //swap
                int temp = arr.get(i);
                arr.set(i,arr.get(min));
                arr.set(min,temp);

                heapify(min);
            }
           
        }

        public int remove(){
            int data = arr.get(0);
            //swap
            int temp = data;
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            arr.remove(arr.size()-1);

            heapify(0);

            return data;
        }
        public boolean isEmpty(){
            return arr.size() == 0 ;
        }

    }

    public static void main(String args[]){
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){    //heap sort  O(n logn )
            System.out.print(h.peek() + " ");
            h.remove();
        }
    }
}
