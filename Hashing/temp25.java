public class temp25{
    static int ptr = 0;
    public static void concate(String s[],String ans[],int i){
        if(i == s.length){
            return;
        }
        ans[ptr++]= s[i];
        concate(s,ans,i+1);

    }
    public static void ans(String s1[],String s2[],String ans[]){
        concate(s1,ans,0);
        concate(s2,ans,0);
    }

    public static void main(String args[]){
        String s1[] = {"hello"};
        String s2[] = {"world"};
        String ans[] = new String[s1.length + s2.length];
        // concate(s1,ans,0);
        // concate(s2,ans,0);
        ans(s1,s2,ans);
        for(String c : ans){
            System.out.print(c);
        }
        
    }
}