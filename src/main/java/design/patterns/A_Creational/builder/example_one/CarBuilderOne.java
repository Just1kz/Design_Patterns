package design.patterns.A_Creational.builder.example_one;

import design.patterns.A_Creational.builder.Car;

public class CarBuilderOne {
    private String mark;
    private Car.Transmission transmission;
    private Integer speed;

    public CarBuilderOne withMark(String mark) {
        this.mark = mark;
        return this;
    }

    public CarBuilderOne withTransmission(Car.Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilderOne withSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    private void reset() {
        this.mark = null;
        this.transmission = null;
        this.speed = null;
    }

    public Car build() {
        Car car = new Car(this.mark, this.transmission, this.speed);
        reset();
        return car;
    }

    @Override
    public String toString() {
        return "CarBuilder{" +
                "mark='" + mark + '\'' +
                ", transmission=" + transmission +
                ", speed=" + speed +
                '}';
    }
}
