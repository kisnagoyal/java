public class assignment{
    public static void freq(int array[][],int key, int m,int n){
        int count = 0;
        for(int i = 0; i <m;i++){
            for(int j = 0; j < n;j++){
            if(array[i][j]==key){
                count++;
            }   }
        }
        System.out.println(count);

    }
    public static void sum(int nums[][],int m, int n){
        int sum = 0;
        for(int i = 0; i < n;i++){
            sum += nums[2][i];
        }
        System.out.println(sum);
    }
    public static void Transpose(int nums[][],int m, int n){
        int m2 = n;
        int n2 = m;
        int ne[][] = new int[n][m];
         for(int i = 0; i < m2; i++){
            for(int j= 0; j< n2;j++){
                ne[i][j]= nums[j][i];              
            }
        }
         for(int i = 0; i <m2; i++){
            for(int j= 0; j< n2;j++){
                System.out.print(ne[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        // int array[][] =  { {4,7,8},
        //                  {8,8,7} };
        // int m = array.length;
        // int n = array[0].length;
        // int key = 8;
        // freq(array,key,m,n);
        //-----------------------------------------------
        int nums[][]= { {1,2},
                        {4,5},
                        {9,3} };
        int m = nums.length;
        int n = nums[0].length;
        // sum(nums,m,n);
       Transpose(nums,m,n);
    }
}