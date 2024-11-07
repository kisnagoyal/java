public class printpairs{
    public static void printpairs(int numbers[]){
        int total_pairs = 0;
        for(int i = 0; i < numbers.length;i++){
            for(int j = i +1; j <numbers.length;j++){
                int curr = numbers[i];                                // for 0,1,2,3,4
                int later = numbers[j];
                System.out.print("(" + curr + "," + later + ")" );
                total_pairs++;
            }
            System.out.println();
        }
        System.out.print("total pairs: "+ total_pairs);
    }

    public static void subarrays(int numbers[]){
        int total_sub = 0;        
        for(int i = 0; i < numbers.length ; i++){
            for(int j = i; j < numbers.length;j++){
                for(int k = i; k <=j; k++){
                    int later = numbers[k];                   
                    System.out.print(later+ " ");                                   
                }
                total_sub++;
                System.out.println();
            }
             System.out.println();
        }
        System.out.println(total_sub);
       
    }

    public static void maxsubarrays(int numbers[]){  // BRUTE FORCE
        int max_sub = Integer.MIN_VALUE;    
        // int current_value = 0;                                      // error
        for(int i = 0; i < numbers.length ; i++){
            for(int j = i; j < numbers.length;j++){
                int curr = numbers[i];
                int current_value = 0;                           // here, current value has taken zero becoz we just have to add subarray
                for(int k = i; k <=j; k++){
                    current_value += numbers[k];                             
                }
                System.out.println(current_value);
                if(current_value > max_sub){
                    max_sub = current_value;
                }
            }
        } 
         System.out.println("max sub: " +max_sub);     
    }

    public static void maxsubarrays2(int numbers[]){
        int curr = 0;
        int max_sub= Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i = 1; i < numbers.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++){
            for(int j =i; j < numbers.length; j++){
                curr = i ==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(curr > max_sub){
                    max_sub = curr;                    
                }
            }
        }
        System.out.println("max is "+ max_sub);
    }

    public static void kadanes(int numbers[]){
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length;i++){
            curr += numbers[i];
            if(curr < 0){
                curr = 0;
            }
            max = Math.max(curr,max);
        }
        System.out.println("max is" + max);
    }

    public static void main(String args[]){
        int numbers[] = {-2,1,-3,4,-1,2,1,-5,4};
        // printpairs(numbers);
        // subarrays(numbers);
        // maxsubarrays(numbers);
        // maxsubarrays2(numbers);
        kadanes(numbers);
      
    }
}
