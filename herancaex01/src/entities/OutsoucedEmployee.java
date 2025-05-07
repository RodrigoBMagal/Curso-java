package entities;

public class OutsoucedEmployee extends Employee{
    private double additionalCharge;

    public OutsoucedEmployee(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutsoucedEmployee() {
        super();
    }

    public OutsoucedEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
