
public class Construction {
    static int tree[];

    public static void init(int arr[]){
        // tree = new int[4*arr.length];
        tree= new int[2*arr.length];
    }

    public static int buildSt(int arr[],int i, int st, int end){
        if(st == end){
            tree[i] = arr[st];
            return arr[st];
        }
        int mid = (st+end)/2;
        buildSt(arr, 2*i +1 , st, mid); //left
        buildSt(arr, 2*i +2,mid +1,end); //right
        return tree[i] = tree[2*i+1] + tree[2*i+2];
    }
    public static int getSumUtil(int i, int si, int sj, int qi,int qj){
        //case 1 non overlap
        if(qi >= sj || qj <= si){
            return 0;
        }
        else if(qi <= si && qj >= sj){ // complete overlap
            return tree[i];
        }
        else{ // partial overlap
            int mid = (si+sj)/2;
            return getSumUtil(2*i+1, si, mid, qi, qj) + getSumUtil(2*i +2, mid +1 , sj, qi, qj);
        }
    }
    public static int getSum(int arr[],int qi,int qj){
        return getSumUtil(0,0,arr.length-1,qi,qj);
    }

    public static void update(int arr[],int idx, int val){
        int n = arr.length-1;
        int diff = val-arr[idx];
        updateUtil(0,0,n, idx, diff);
    }
    private static void updateUtil(int i, int si, int sj, int idx, int diff) {
        if(idx > sj || idx < si){
            return;
        }
        tree[i] += diff;
        if(si != sj){
            int mid = (si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, diff);
            updateUtil(2*i+2, mid+1,sj, idx, diff);
        }
    }


    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8};
        init(arr);
        buildSt(arr, 0, 0, arr.length-1);
        // for(int i = 0; i<tree.length;i++){
        //     System.out.print(tree[i] + " ");
        // }

        System.out.println(getSum(arr, 2, 5));
        update(arr, 2,2);
        System.out.println(getSum(arr, 2, 5));
    }
}
