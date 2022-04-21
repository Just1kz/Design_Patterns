package design.patterns.A_Creational.builder;

import design.patterns.A_Creational.builder.example_one.CarBuilderOne;
import design.patterns.A_Creational.builder.example_two.CarBuilderTwo;
import design.patterns.A_Creational.builder.example_two.Director;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

        List<Integer> list = new ArrayList<>(100);
        for(int x=0; x<100; x++) {
            list.add(x);
        }
        System.out.println(list.size());

        int pageSize = 45;
        int pageNumber = 3;
        int start = (pageNumber - 1) * pageSize;
        int end = Math.min((start + pageSize), list.size());
        System.out.println(IntStream.range(start, end).mapToObj(list::get).collect(Collectors.toList()));

        Car car1 = new Car("as", Car.Transmission.MANUAL, 100);
        Car car2 = new Car("as", Car.Transmission.MANUAL, 100);
        Car car3 = new Car("as", Car.Transmission.MANUAL, 100);
        Car car4 = new Car("as", Car.Transmission.MANUAL, 150);
        Car car5 = new Car("as", Car.Transmission.MANUAL, 150);
        Car car6 = new Car("as", Car.Transmission.MANUAL, 200);
        List<Car> list2 = new ArrayList<>();
        list2.add(car1);
        list2.add(car2);
        list2.add(car3);
        list2.add(car4);
        list2.add(car5);
        list2.add(car6);
        Map<String, Long> map = list2.stream()
                .collect(Collectors.groupingBy((x->String.valueOf(x.getSpeed())), Collectors.counting()));
        System.out.println(map);
        long all = map.values().stream().mapToLong(x->x).sum();
        map.put("all", all);
        System.out.println(map);
    }
}
