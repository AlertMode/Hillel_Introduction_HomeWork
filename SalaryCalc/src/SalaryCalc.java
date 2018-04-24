public class SalaryCalc {
    public static long wageCalculatorMoney(long days) {
        long salary = 1;
        long sum = 0;
        for(long counter = days; counter > 0; counter--) {
            sum += salary;
            salary *= 3;
        }
        return sum;
    }

    public static long wageCalculatorDays(long money) {
        long days = 0;
        long salary = 1;
        long sum = 0;
        while(sum < money){
            sum += salary;
            salary *= 3;
            days++;
        }
            return days;
    }
}