import java.util.ArrayList;

public class Buy_Sell_Stack {

    static int maxProfit(ArrayList<Integer> prices)
    {
        int mini=prices.get(0);
        int MaxValue= 0;
        int n= prices.size();
        
        for (int i = 1; i < n; i++) {
            int  cost = prices.get(i)-mini;
            MaxValue = Math.max(MaxValue, cost);
            mini =   Math.min(mini, prices.get(i));        }
        return MaxValue;
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(){
            {
                add(7);add(1);add(5);add(3);add(6);add(4);
            }
        };
        
        int ans=maxProfit(array);

        System.out.println("Profit of :"+ans);
    }



}
