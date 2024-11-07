public class str1{
    public static boolean ispalindrome(String str){
        for(int i = 0; i < str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static float shortestPath(String path){
        int x = 0; int y = 0;
        for(int i = 0 ; i < path.length();i++){
            char dir = path.charAt(i);
            //south
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2= y*y;
        float disp = (float)Math.sqrt(x2 +y2);
        return disp;
    }

    public static void isStringSame(String str1,String str2){
        if(str1.equals(str2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }

    public static void subString(String st, int StartIndex, int EndIndex){
        for(int i = StartIndex; i < EndIndex; i++){
            // System.out.print(st.charAt(i) + " ");
            // method 2
            String substr = "";
            substr += st.charAt(i);
             System.out.print(substr);
        }
    }






    public static void main(String args[]){
        String str = "abcba";
        // System.out.println(ispalindrome(str));
        // String path = "WNEENESENNN";
        // System.out.println(shortestPath(path));
// ------------------------------------------------------------------------------------------------------------------
        // String str1 = "tony";
        // String str2 = new String("ton");                  //to check strings are equal or not don't use == instead use .equals();
        // isStringSame(str1,str2);
// ------------------------------------------------------------------------------------------------------------------
        int StartIndex = 5;
        int EndIndex = 10;
        String st = " hey buddy! how are you ?";
        // subString(st,StartIndex,EndIndex);

        // built in funct to print substr
        System.out.print(st.substring(5,10));
    }
}