import java.util.Scanner;
public class predictionUsingRecursion {
    public static double predictFutureValue(double currentValue,double growthRate,int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictFutureValue(currentValue,growthRate,years-1)*(1+growthRate);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter current value: ");
        double currentValue = sc.nextDouble();
        System.out.print("enter growth rate(%):");
        double rate = sc.nextDouble()/100;
        System.out.print("enter number of years:");
        int years = sc.nextInt();
        double futureValue =
                predictFutureValue(currentValue, rate, years);
        System.out.println("predicted future value="+futureValue);
        sc.close();
    }
}