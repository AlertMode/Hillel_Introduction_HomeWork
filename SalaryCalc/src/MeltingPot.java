public class MeltingPot {
    public static void main(String[] args) {
        UI display = new UI();

        UI.loginDisplay();
        display.landingPage();
        long days;
        long salary;
        while(!display.exit()) {
            switch (display.getOption()) {
                case 1:
                    days = display.inputPortDays();
                    salary = SalaryCalc.wageCalculatorMoney(days);
                    display.outputPortMoney(salary);
                    break;
                case 2:
                    salary = display.inputPortMoney();
                    days = SalaryCalc.wageCalculatorDays(salary);
                    display.outputPortDays(days);
                    break;
            }
            display.landingPage();
        }
    }
}
