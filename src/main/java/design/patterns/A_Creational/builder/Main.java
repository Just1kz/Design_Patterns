package design.patterns.A_Creational.builder;

import design.patterns.A_Creational.builder.example_one.CarBuilderOne;
import design.patterns.A_Creational.builder.example_two.CarBuilderTwo;
import design.patterns.A_Creational.builder.example_two.Director;

public class Main {
    public static void main(String[] args) {
        //Example_one
        CarBuilderOne carBuilderOne = new CarBuilderOne()
                .withSpeed(150)
                .withMark("Toyota")
                .withTransmission(Car.Transmission.MANUAL);
        Car car = carBuilderOne.build();
        System.out.println(car);
        System.out.println(carBuilderOne);

        System.out.println("=====================================");

        //Example_two
        Director director = new Director();
        CarBuilderTwo carBuilderTwo = new CarBuilderTwo();
        director.constructSportsCar(carBuilderTwo);
        car = carBuilderTwo.getResult();
        System.out.println(car);
        System.out.println(carBuilderTwo);
    }
}
