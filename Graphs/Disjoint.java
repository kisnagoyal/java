public class Disjoint {
    static int n = 7;
    static int rank[] = new int[n];
    static int par[] = new int[n];

    public static void init(){
        for(int i = 0; i<par.length;i++){
            par[i] = i;
        }
    }
    public static int find(int x){
        if(x == par[x]){
            return x;
        }
        return par[x] = find(par[x]); // path compression for optimisation
        //or simply return find(par[x])

    }

    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }
        else if(rank[parA] < rank[parB]){
            par[parA] = parB;
        }
        else{
            par[parB] = parA;
        }
    }
    public static void main(String args[]){
        init();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        union(1, 5);

    }


}
