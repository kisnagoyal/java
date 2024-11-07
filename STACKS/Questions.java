import java.util.*;

public class Questions {

    public static void addAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        
        int top = s.pop();
        addAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str){
        Stack<Character> st = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            st.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!st.isEmpty()){
            char curr= st.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void reverseStack(Stack <Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        addAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // addAtBottom(s,4);

        System.out.println(".........................");
        reverseStack(s);

        printStack(s);

        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // String result = reverseString(str);
        // System.out.println(result);



    }
}
