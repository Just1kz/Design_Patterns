package design.patterns.A_Creational.builder.example_two;

import design.patterns.A_Creational.builder.Car;

public interface Builder {
    void withTransmission(Car.Transmission transmission);
    void withSpeed(int speed);
    void withMark(String mark);
    void reset();
}
