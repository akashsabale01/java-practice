public class Main {

    static int maximumWealth(int[][] accounts){
        int maxWealth = Integer.MIN_VALUE;

        for(int[] singlePersonAccounts: accounts){
            int totalWealthOf1Person = 0;

            for(int accountBalOf1Bank: singlePersonAccounts){
                totalWealthOf1Person += accountBalOf1Bank;
            }

            if(totalWealthOf1Person > maxWealth)
                maxWealth = totalWealthOf1Person;
        }

        return maxWealth;
    }

    public static void main(String[] args) {

        int[][] arr1 = {
                {1,5},
                {7,3},
                {3,5}
        };

        int[][] arr2 = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };

        System.out.println("Max Wealth = " + maximumWealth(arr1));
        System.out.println("Max Wealth = " + maximumWealth(arr2));
    }
}