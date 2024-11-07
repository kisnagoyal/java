public class Search2D{

    public static boolean StaircaseSearch(int matrix[][], int key){
        int row = matrix.length-1;int column = 0;
        while(column < matrix.length && row >= 0){
            if(matrix[row][column] == key){
                System.out.println("your key is at (" + row +"," + column + ")");
                return true;
            }
            else if(matrix[row][column] > key){
                row--;
            }
            else{
                column++;
            }
        }
           System.out.println("key not found!");
           return false;          
    }

    public static void spiralMatrix(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length -1;
        
       while(endrow >= startrow && endcol >= startcol){
                        // //   {{1,2,3,10},
                        //   {4,5,6,20},
                        //   {7,8,9,50}};
            //Top                                                                                   
            for(int j = startcol;j <= endcol;j++){
                System.out.print(matrix[startrow][j] +" ");
            }
            //right
            for(int i = startrow + 1; i <= endrow;i++){
                System.out.print(matrix[i][endcol] +" ");
            }
            //bottom
            for(int j = endcol -1; j >= startcol; j--){// for(int j = endcol -1; j >= startrow; j--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j] +" ");
            }
            //left
            for(int i = endrow-1; i >=startrow+1; i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol] +" ");                

            }
        
        startrow++;
        startcol++;
        endcol--;
        endrow--;

        }
    }



    public static void main(String args[]){
        int key = 3;
        // int matrix[][] = {{1,2,3,10},
        //                   {4,5,6,20},
        //                   {7,8,9,50},
        //                   {11,12,13,60}};
        int matrix[][] = {{1,3}};
        StaircaseSearch(matrix,key);
        // spiralMatrix(matrix);
    }
}