import java.time.LocalDate;
import  java.time.temporal.ChronoUnit;

/**
 * Represents a fine system
 */
public class Fine {
    private Loan loan;
    private Double value;

    /**
     * Cretaes a fine for the user to pay
     * @param loan the information about the loan
     */
    public Fine(Loan loan) {
        this.loan = loan;
        this.value = calculateFine();
        
    }

    /**
     * Calculates how many days have passed after the due date
     * @param this.loan the information about the loan
     * @return the days that have passed since the due date
     */
    public long daysLate() {
        return ChronoUnit.DAYS.between(this.loan.getDueDate(), LocalDate.now());
    }

    /**
     * Calculates the value of the fine based on how many days have passed
     * @param this.loan the information about the loan
     * @return the value of the fine
     */
    public Double calculateFine() {
        long daysLate = daysLate();
        if(daysLate > 30) {
            return this.loan.getRequestedBook().getPrice();
        } else if (this.loan.isOverdue()) {
            return 0.5 * daysLate;
        }
        return 0.0;
    } 
}