import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeRefactoredTest {

    @Test
    void calculateAndApplyAnnualBonusRefactored_PerformanceScoreGreaterThanZero_AppliesBonusToRecord() {
        // Arrange
        double performanceScore = 8.5;
        EmployeeRefactored employee = new EmployeeRefactored(performanceScore);

        // Act
        employee.calculateAndApplyAnnualBonusRefactored();

        // Assert
        assertEquals(8500, employee.getBonus());
    }

    @Test
    void calculateAndApplyAnnualBonusRefactored_PerformanceScoreZero_AppliesZeroBonusToRecord() {
        // Arrange
        double performanceScore = 0.0;
        EmployeeRefactored employee = new EmployeeRefactored(performanceScore);

        // Act
        employee.calculateAndApplyAnnualBonusRefactored();

        // Assert
        assertEquals(0.0, employee.getBonus());
    }

    @Test
    void calculateAndApplyAnnualBonusRefactored_PerformanceScoreNegative_AppliesZeroBonusToRecord() {
        // Arrange
        double performanceScore = -2.5;
        EmployeeRefactored employee = new EmployeeRefactored(performanceScore);

        // Act
        employee.calculateAndApplyAnnualBonusRefactored();

        // Assert
        assertEquals(0.0, employee.getBonus());
    }
}
