package design.patterns.A_Creational.prototype;

import java.util.Date;
import java.util.Objects;

public abstract class Contract {
    protected String id;
    protected int cost;
    protected Date date;

    public Contract() {
    }

    public Contract(Contract source) {
        if (source != null) {
            this.id = source.id;
            this.cost = source.cost;
            this.date = source.date;
        }
    }

    public abstract Contract clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return cost == contract.cost && Objects.equals(id, contract.id) && Objects.equals(date, contract.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cost, date);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
