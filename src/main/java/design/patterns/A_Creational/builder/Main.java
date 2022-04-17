package design.patterns.A_Creational.builder;

import design.patterns.A_Creational.builder.example_one.CarBuilder;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder()
                .withSpeed(150)
                .withMark("Toyota")
                .withTransmission(Car.Transmission.MANUAL);
        Car car = carBuilder.build();
        System.out.println(car);
        System.out.println(carBuilder);
    }
}
