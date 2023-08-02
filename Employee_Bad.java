public class Employee {
 private double performanceScore;
 private double bonus;

 public Employee(double performanceScore) {
     this.performanceScore = performanceScore;
     this.bonus = 0.0;
 }

 public void calculateAndApplyAnnualBonus() {
     // Calculate bonus based on employee's performance score
     double bonusCalculation = calculateBonusBasedOnPerformance();

     // Apply bonus to employee's record
     applyBonusToRecord(bonusCalculation);
 }

 private double calculateBonusBasedOnPerformance() {
     return performanceScore * 1000.0;
 }

 private void applyBonusToRecord(double bonus) {
     // Code to apply bonus to employee's record goes here
     System.out.println("Bonus applied to the record: " + bonus);
 }

 public double getBonus() {
     return bonus;
 }

 public static void main(String[] args) {
	 Employee employee = new Employee(8.5);

     employee.calculateAndApplyAnnualBonus();

     System.out.println("Original Bonus: " + employee.getBonus());
 }
}
