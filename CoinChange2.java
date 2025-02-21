public class CoinChange2 {
        public int change(int amount, int[] coins) {
            int [] dp = new int[amount+1];
            dp[0]= 1;

            for(int coin : coins){
                for(int x = coin;x<amount+1;x++){
                    dp[x]+=dp[x-coin];
                }
            }
            return dp[amount];
        }

        public static void main(String[] args){
            CoinChange2 c  = new CoinChange2();
            int[] coins = {1,2,5};int amount = 11;
            System.out.println(c.change(amount,coins));
        }
    }

