import java.util.*;
public class IndianCoins {
    public static void main(String args[]){
        Integer coins[] = {1,2,5,10,20,500,50,2000};
        Arrays.sort(coins,Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 590;

        ArrayList<Integer> coin = new ArrayList<>();
        for(int i = 0; i< coins.length;i++){
            if(amount >= coins[i]){
                while(coins[i] <= amount){
                    countOfCoins++;
                    amount -= coins[i];
                    coin.add(coins[i]);
                }
            }
        }
        System.out.println("total (min) coins are " + countOfCoins);
        for(int i = 0; i< coin.size();i++){
            System.out.print(coin.get(i) + " ");
        }
        System.out.println();
    }
}
