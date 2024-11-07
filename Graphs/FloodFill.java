public class FloodFill {
    public static int[][] floodFill(int img[][], int sr,int sc, int color){
        boolean vis[][]= new boolean[img.length][img[0].length];
        int orgColor = img[sr][sc];
        helper(img, sr,sc,color,vis,orgColor);
        

        return img;
    }
    private static void helper(int[][] img, int sr, int sc, int color, boolean[][] vis, int orgColor) {
        if(sr <0 || sr >= img.length || sc <0 || sc >= img[0].length || img[sr][sc] != orgColor || vis[sr][sc]){
            return;
        }
        vis[sr][sc] = true;
        img[sr][sc] = color;
        //left
        helper(img, sr, sc-1, color, vis, orgColor);
        //right
        helper(img, sr, sc+1, color, vis, orgColor);
        //up
        helper(img, sr-1, sc, color, vis, orgColor);
        //down
        helper(img, sr+1, sc, color, vis, orgColor);
    }
    public static void main(String args[]){
        int img[][] = {{1,1,1},
                        {1,1,0},
                        {1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2; 
        floodFill(img, sr, sc, color);
        for(int i = 0;i<img.length;i++){
            for(int j = 0; j<img[0].length;j++){
                System.out.print(img[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
