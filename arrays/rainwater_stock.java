public class rainwater_stock{

public static void rainwater(int height[]){
    int n = height.length;
    // for left max
    int leftmax[] = new int[height.length];
    leftmax[0]= height[0];
    for(int i = 1; i < height.length; i++){
        leftmax[i]= Math.max(height[i],leftmax[i-1]);
    }

    // for right max
    int rightmax[] = new int[height.length];
    rightmax[n-1]= height[n-1];
    for(int i = n-2;i >= 0; i--){
        rightmax[i]= Math.max(rightmax[i+1],height[i]);
    }
    
    int totalVol = 0;
    for(int i =1 ; i < height.length; i++){
       int waterVol = Math.min(rightmax[i],leftmax[i]);
       totalVol += (waterVol - height[i]);
    }
    System.out.println(totalVol);
}

    public static void stock(int prices[]){
        int buy_price = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i< prices.length;i++){
            if(buy_price < prices[i]){// profit
             int profit = prices[i]- buy_price;
            maxprofit = Math.max(maxprofit,profit);  
            }
            else{
             buy_price = prices[i];
             }
        }
        System.out.println(maxprofit);
    }



    public static void main(String args[]){
       int prices[] = {7,5,3,6,4};
       int height[] = {4, 2, 0, 3, 2, 5};
       stock(prices);
    // rainwater(height);
    }
}