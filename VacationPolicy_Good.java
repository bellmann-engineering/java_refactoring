public class VacationPolicy {
    private static final double US_ACCRUAL_RATE = 1.0;
    private static final double EU_ACCRUAL_RATE = 1.5;

    private double usVacationBalance;
    private double euVacationBalance;

    public VacationPolicy() {
        usVacationBalance = 0;
        euVacationBalance = 0;
    }

    private void accrueVacation(double accrualRate) {
        if (accrualRate < 0) {
            throw new IllegalArgumentException("Accrual rate cannot be negative.");
        }
        usVacationBalance += accrualRate;
        euVacationBalance += accrualRate;
    }

    public void accrueUSDivisionVacation() {
        accrueVacation(US_ACCRUAL_RATE);
    }

    public void accrueEUDivisionVacation() {
        accrueVacation(EU_ACCRUAL_RATE);
    }

    public double getUSVacationBalance() {
        return usVacationBalance;
    }

    public double getEUVacationBalance() {
        return euVacationBalance;
    }

    public static void main(String[] args) {
        VacationPolicy vacationPolicy = new VacationPolicy();

        vacationPolicy.accrueUSDivisionVacation();
        vacationPolicy.accrueEUDivisionVacation();

        double usBalance = vacationPolicy.getUSVacationBalance();
        double euBalance = vacationPolicy.getEUVacationBalance();

        System.out.println("US Vacation Balance: " + usBalance + " days");
        System.out.println("EU Vacation Balance: " + euBalance + " days");
    }
}
