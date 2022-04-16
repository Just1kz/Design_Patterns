package design.patterns.A_Creational.factory_method.example_two;

public class Main {
    public static void main(String[] args) {
        DtoFactory dtoFactory = createDtoFactoryByCode("human");
        Dto dto = dtoFactory.createDtoWithName("Anton");

        dto.doSomething();
    }

    private static DtoFactory createDtoFactoryByCode(String code) {
        DtoFactory dtoFactory;

        switch (code) {
            case "human":
                dtoFactory = new HumanFactory();
                break;
            case "animal":
                dtoFactory = new AnimalFactory();
                break;
            default:
                throw new RuntimeException("This code for create DtoFactory is not supported");
        }

        return dtoFactory;
    }
}
