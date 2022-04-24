package design.patterns.A_Creational.prototype.example_two;

import java.util.Date;

/**
 * Клонирование объекта с помощью интерфейса Cloneable
 */
public class SaleContract implements Cloneable {
    private final String id;
    private final int cost;
    private final Date date;

    public SaleContract(String id, int cost, Date date) {
        this.id = id;
        this.cost = cost;
        this.date = date;
    }

    @Override
    public SaleContract clone() {
        try {
            return (SaleContract) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "SaleContract{" +
                "link=" + super.toString() +
                ", id='" + id + '\'' +
                ", cost=" + cost +
                ", date=" + date +
                '}';
    }

    public String getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }

    public Date getDate() {
        return date;
    }
}
