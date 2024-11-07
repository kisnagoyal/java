public class str2{
    public static String largestString(String str[]){//lexicographic..
        String largest = str[0];
        for(int i = 0; i < str.length;i++){
            if(largest.compareTo(str[i]) < 0){     //.comparetoIgnorecase()
                largest = str[i];
            }
        }
        return largest;
        
    }

    public static void strbuilder(StringBuilder sb){
        for(char i = 'a'; i <= 'z'; i++){
            sb.append(i + " ");
        }
        System.out.print(sb);
    }

    public static String UpperCase(String st){
        StringBuilder s = new StringBuilder("");
        char ch =Character.toUpperCase(st.charAt(0));
        s.append(ch);
        for(int i = 0; i < st.length();i++){
            if(st.charAt(i)==' ' && i < st.length()-1){
                s.append(st.charAt(i));
                i++;
                s.append(Character.toUpperCase(st.charAt(i)));
            }
            else{
                s.append(st.charAt(i));
            }
        }
        return s.toString();
    }

    public static String compress(String stt){
        StringBuilder s = new StringBuilder("");
        for(int i = 0; i < stt.length();i++){
            Integer count = 1;
            while( i < stt.length()-1 && stt.charAt(i)== stt.charAt(i+1)){
                count++;
                i++;
            }
            s.append(stt.charAt(i));
            if(count >1){
                s.append(count.toString());
            }
        }
        return s.toString();

    }



    public static void main(String args[]){
        // String str[] = {"mango","banana","apple"};
        // System.out.println(largestString(str));
        StringBuilder sb = new StringBuilder("");
        // strbuilder(sb);
        // String st = " hi ! buddy How ARE yOu ?";
        // System.out.println(UpperCase(st));
        String stt = "a  bbbc";
        System.out.println(compress(stt));
    }
}