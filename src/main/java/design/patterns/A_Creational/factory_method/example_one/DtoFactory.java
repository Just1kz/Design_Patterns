package design.patterns.A_Creational.factory_method.example_one;

import design.patterns.A_Creational.factory_method.example_two.Dto;
import design.patterns.A_Creational.factory_method.example_two.Human;

public class DtoFactory {

    public static <T extends Dto> T createDto(Class<T> tClass) {
        T dto;
        try {
            dto = tClass.newInstance();
        } catch (Exception e) {
            dto = null;
        }
        return dto;
    }

    public static void main(String[] args) {
        Human human = DtoFactory.createDto(Human.class);
        System.out.println(human);
    }
}
