public class ImpProb{

    public static int totalWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        // horizontal ways
        int fnm2 = totalWays(n-2);
        int fnm1 = totalWays(n-1);
        int total = fnm1 + fnm2;
        return total;
    }


    public static void removeDuplicates(String str, int index , StringBuilder newString, boolean map[] ){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        //kaam
        char currchar = str.charAt(index);
        if(map[currchar - 'a'] == true){
            //duplicate
            removeDuplicates(str,index+1,newString,map);
        }
        else{
            map[currchar -'a'] = true;
            newString.append(currchar);
            removeDuplicates(str,index+1,newString,map);

        }

    }

    public static void main(String args[]) {
        int n = 3;
        // System.out.println("total no of ways is/are " + totalWays(n));

        String str = "apnacollege";
        boolean map[] = new boolean[26];
        removeDuplicates(str,0, new StringBuilder(""),map);
        
    }
}