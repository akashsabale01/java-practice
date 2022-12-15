public class Main {

    public static int getMax(int ...numbersArgs){
        int n = numbersArgs.length;

        if(n == 0)
            return Integer.MIN_VALUE;

        int maxNum = numbersArgs[0];

        for(int i=1; i<n; i++){
            if(numbersArgs[i] > maxNum)
                maxNum = numbersArgs[i];
        }

        return maxNum;
    }

    public static void main(String[] args) {

        System.out.println(getMax());
        System.out.println(getMax(33));
        System.out.println(getMax(33, 55));
        System.out.println(getMax(33, 55, 2,333,44));
        System.out.println(getMax(33, 55, 2,333,44, 3,33,21, 5555,11,2222,33));
    }
}