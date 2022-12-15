public class Main {

    public static double getSum(double ...priceArgs){
        double totalSum = 0;

        for(double item: priceArgs)
            totalSum += item;

        return totalSum;
        }
    public static double priceAfterDiscount(double ...priceArgs){
        double totalAmount = getSum(priceArgs);

        double finalAmount = 0;

        if(totalAmount < 100)
            finalAmount = totalAmount - (10.00/100);
        else if (totalAmount <= 500 && totalAmount> 100) {
            finalAmount = totalAmount - (20.00/100);
        }
        else if(totalAmount> 500) {
            finalAmount = totalAmount - (30.00/100);
        }

        return finalAmount;
    }

    public static void main(String[] args) {


        System.out.println("Original Amount = " + getSum(100,2000,3000));
        System.out.println("Final Amount after Discount = " + priceAfterDiscount(100,2000,3000));
    }
}