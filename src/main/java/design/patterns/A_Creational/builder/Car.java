package design.patterns.A_Creational.builder;

public class Car {
    private String mark;
    private Transmission transmission;
    private int speed;

    public enum Transmission {
        MANUAL, AUTO
    }

    public Car(String mark, Transmission transmission, int speed) {
        this.mark = mark;
        this.transmission = transmission;
        this.speed = speed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", transmission=" + transmission +
                ", speed=" + speed +
                '}';
    }
}
