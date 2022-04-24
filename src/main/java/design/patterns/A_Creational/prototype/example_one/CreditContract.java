package design.patterns.A_Creational.prototype.example_one;

import design.patterns.A_Creational.prototype.Contract;

import java.util.Objects;

/**
 * Клонирование объекта с помощью оператора new
 */
public class CreditContract extends Contract {
    private double percent;
    private PaymentType paymentType;

    public CreditContract(){
    }

    public CreditContract(CreditContract source) {
        super(source);
        if (source != null) {
            this.percent = source.percent;
            this.paymentType = source.paymentType;
        }
    }

    @Override
    public Contract clone() {
        return new CreditContract(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CreditContract that = (CreditContract) o;
        return Double.compare(that.percent, percent) == 0 && paymentType == that.paymentType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), percent, paymentType);
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "CreditContract{" +
                "link=" + super.toString() +
                ", id='" + id + '\'' +
                ", cost=" + cost +
                ", date=" + date +
                ", percent=" + percent +
                ", paymentType=" + paymentType +
                '}';
    }
}
