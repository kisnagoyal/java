import java.util.*;

public class IsParenthesis {

    public static boolean isValidParenthesis(String str){ //O(n)
        Stack<Character> s= new Stack<>();
        for(int i = 0; i< str.length();i++){
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
                s.push(str.charAt(i));
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek() == '{' && str.charAt(i) == '}' || s.peek() == '[' && str.charAt(i) == ']' || s.peek() == '(' && str.charAt(i) == ')'){
                    s.pop();
                    
                }
                else{
                    return false;
                }
            }

        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isDuplicate(String str){ //o(n)
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            
            //closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    count++;
                    s.pop();
                }
                s.pop();
                
                /* while(s.pop() != '('){
                    count++;
                }
                if(count < 1){
                    return true;
                } */

                if(count < 1){
                    return true;
                }
            }
            //opening
            else{
                s.push(ch);
            }
        }
        return false;

    }
    public static void main(String args[]){
        String str = "{[(())]}}";
        //valid string
        String str1 = "((a+b)+c)";
        String str2 = "((a+b))";
       System.out.println(isDuplicate(str1)); 
    }
}
