import java.util.ArrayList;

public class ContainerMostWater{

    public static int storedWater(ArrayList<Integer> height){ //O(n2)
        int mostWater = Integer.MIN_VALUE;
        for(int i = 0; i< height.size();i++){
            for(int j = i+1; j< height.size();j++){
                int width = j-i;
                int h = Math.min(height.get(i),height.get(j));
                int water = width *h;
                mostWater = Math.max(mostWater,water);
            }
        }
        return mostWater;
    }
    public static int WaterStored(ArrayList<Integer>height){ //o(n)
        int mostWater = 0;
        int lp = 0;
        int rp = height.size()-1;
        while(lp <rp){
            int h = Math.min(height.get(lp),height.get(rp));
            int width = rp -lp;
            int water = width*h;
            mostWater = Math.max(water,mostWater);
            if(height.get(lp) < height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return mostWater;

    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(18);
        height.add(17);
        height.add(6);
        // height.add(3);
        // height.add(10);
        
        System.out.println("brute force: " + storedWater(height));
        System.out.println("Two pointer: "+ WaterStored(height));

    }
}
