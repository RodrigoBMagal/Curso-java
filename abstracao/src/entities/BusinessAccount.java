package entities;

public class BusinessAccount extends Account{
    private double loanLimit;

    public BusinessAccount() {
    }

    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public BusinessAccount(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }
    public void loan(Double amount) {
        if (amount <= loanLimit) {
            balance =+ amount - 10;
        }
    }
}
