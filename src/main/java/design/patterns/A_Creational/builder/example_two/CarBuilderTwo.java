package design.patterns.A_Creational.builder.example_two;

import design.patterns.A_Creational.builder.Car;

public class CarBuilderTwo implements Builder {
    private String mark;
    private Car.Transmission transmission;
    private Integer speed;

    @Override
    public void withTransmission(Car.Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void withSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void withMark(String mark) {
        this.mark = mark;
    }

    @Override
    public void reset() {
        this.mark = null;
        this.transmission = null;
        this.speed = null;
    }

    public Car getResult() {
        Car car = new Car(mark, transmission, speed);
        reset();
        return car;
    }

    @Override
    public String toString() {
        return "CarBuilderTwo{" +
                "mark='" + mark + '\'' +
                ", transmission=" + transmission +
                ", speed=" + speed +
                '}';
    }
}
