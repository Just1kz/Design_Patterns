package design.patterns.A_Creational.builder.example_two;

import design.patterns.A_Creational.builder.Car;

/**
 * Директор знает в какой последовательности заставлять работать строителя. Он
 * работает с ним через общий интерфейс Строителя. Из-за этого, он может не
 * знать какой конкретно продукт сейчас строится.
 */
public class Director {
    public void constructSportsCar(Builder builder) {
        builder.withMark("Audi");
        builder.withSpeed(300);
        builder.withTransmission(Car.Transmission.MANUAL);
    }

    public void constructCityCar(Builder builder) {
        builder.withMark("Toyota");
        builder.withSpeed(120);
        builder.withTransmission(Car.Transmission.AUTO);
    }
}
