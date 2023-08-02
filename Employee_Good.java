public class EmployeeRefactored {
    private double performanceScore;
    private double bonus;

    public EmployeeRefactored(double performanceScore) {
        this.performanceScore = performanceScore;
        this.bonus = 0.0;
    }

    public void calculateAndApplyAnnualBonusRefactored() {
        // Inline the calculateBonusBasedOnPerformance method
        double bonusCalculation = performanceScore * 1000.0;

        // Separate variable for applying the bonus to the record
        double bonusWithRecord = applyBonusToRecordAndGetUpdatedBonus(bonusCalculation);

        // Save the updated bonus back to the instance variable
        this.bonus = bonusWithRecord;
    }

    private double applyBonusToRecordAndGetUpdatedBonus(double bonus) {
        // Code to apply bonus to employee's record goes here
        System.out.println("Bonus applied to the record: " + bonus);
        // In a real scenario, you might have more logic here that affects the bonus value.
        // For demonstration purposes, we'll just return the same bonus.
        return bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public static void main(String[] args) {
        EmployeeRefactored employee = new EmployeeRefactored(8.5);

        employee.calculateAndApplyAnnualBonusRefactored();

        System.out.println("Refactored Bonus: " + employee.getBonus());
    }
}
