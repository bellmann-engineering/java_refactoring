public abstract class VacationPolicy {
    public void accrueVacation() {
        double vacationAccrual = calculateVacationAccrual();
        vacationAccrual = applyMinimumVacation(vacationAccrual);
        applyToPayrollRecord(vacationAccrual);
    }

    protected abstract double calculateVacationAccrual();

    protected abstract double applyMinimumVacation(double vacationAccrual);

    private void applyToPayrollRecord(double vacationAccrual) {
        // Some logic to apply the calculated vacation accrual to the payroll record
        // Replace this with your actual logic
        System.out.println("Vacation accrual applied to payroll: " + vacationAccrual + " days");
    }

    public static void main(String[] args) {
        VacationPolicy usVacationPolicy = new USVacationPolicy();
        VacationPolicy euVacationPolicy = new EUVacationPolicy();

        usVacationPolicy.accrueVacation();
        euVacationPolicy.accrueVacation();
    }
}

class USVacationPolicy extends VacationPolicy {
    @Override
    protected double calculateVacationAccrual() {
        // Add logic to calculate vacation accrual for US division
        return 0.0;
    }

    @Override
    protected double applyMinimumVacation(double vacationAccrual) {
        if (vacationAccrual < 10)
            vacationAccrual = 10;
        return vacationAccrual;
    }
}

class EUVacationPolicy extends VacationPolicy {
    @Override
    protected double calculateVacationAccrual() {
        // Add logic to calculate vacation accrual for EU division
        return 0.0;
    }

    @Override
    protected double applyMinimumVacation(double vacationAccrual) {
        if (vacationAccrual < 24)
            vacationAccrual = 24;
        return vacationAccrual;
    }
}
