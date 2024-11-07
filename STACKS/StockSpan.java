import java.util.Stack;
public class StockSpan {

    public static void span(int stock[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i = 1; i< stock.length;i++){
            while(!s.isEmpty() && stock[i] >= stock[s.peek()]){
                 s.pop();    
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }
            else{
                span[i] = i - s.peek(); //s.peek is prev high
            }
            
            s.push(i);
        }
    }
    public static void main(String args[]){
        int stock[] = {100 ,80, 60, 70, 60, 75, 200};
        int span[] = new int[stock.length];
        span(stock, span);

        for(int i = 0; i< span.length;i++){
            System.out.print(span[i] + " ");
        }
    }
}
