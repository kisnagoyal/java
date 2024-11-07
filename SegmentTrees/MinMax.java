//for min just convert max to min, min to max

public class MinMax {
    static int tree[];

    public static void init(int n){
        tree = new int[4*n];
    }

    public static void buildSt(int i, int si, int sj,int arr[]){ //o(n)
        if(si == sj){
            tree[i] = arr[si];
            return;
        }
        int mid = (si+sj)/2;
        buildSt(2*i+1, si, mid,arr);
        buildSt(2*i+2,mid +1,sj,arr);

        tree[i] = Math.max(tree[2*i+1],tree[2*i+2]);   
    }

    public static int getMaxUtil(int i,int si,int sj,int qi,int qj){
        if(qi > sj || qj < si){
            return Integer.MIN_VALUE;
        }
        else if(si >= qi && sj <= qj){
            return tree[i];
        }
        int mid = (si+sj)/2;
        int left = getMaxUtil(2*i+1, si, mid, qi, qj);
        int right = getMaxUtil(2*i+2,mid+1,sj, qi, qj);

        return  Math.max(left, right);
    }
    public static int getMax(int arr[],int qi,int qj){
        return getMaxUtil(0,0,arr.length-1,qi,qj);
    }


    public static void updateUtil(int i, int si, int sj, int idx, int val){
        if(idx < si || idx > sj){
            return;
        }
        if(si == sj){
            tree[i] = val;
        }
        if(si != sj){
            tree[i] = Math.max(tree[i],val);
            int mid = (si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, val);
            updateUtil(2*i+2,mid+1,sj, idx, val);
        }
    }
    public static void update(int arr[], int idx, int val){
        arr[idx] = val;
        updateUtil(0,0,arr.length-1,idx,val);
    }



    public static void main(String[] args) {
        int arr[]= {6,8,-1,2,17,1,3,2,4};
        init(arr.length);
        buildSt(0, 0, arr.length-1,arr);

        // for(int i = 0; i<tree.length;i++){
        //     System.out.print(tree[i] + " ");
        // }

        System.out.println(getMax(arr, 2, 5));
        update(arr, 2,20);
        System.out.println(getMax(arr, 2, 5));
    }
}
