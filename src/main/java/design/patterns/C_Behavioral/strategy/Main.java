package design.patterns.C_Behavioral.strategy;

import design.patterns.C_Behavioral.state.CodeActivity;
import design.patterns.C_Behavioral.state.ReadActivity;
import design.patterns.C_Behavioral.state.SleepActivity;
import design.patterns.C_Behavioral.state.TrainActivity;

/**
 *  Бизнес-логика одного и того же метода клиентского класса меняется в зависимости от передаваемого в него класса с изменяющейся бизнес логикой,
 *  переиспользованы реализации с шаблона состояние
 */
public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new SleepActivity());
        developer.execute();

        developer.setActivity(new CodeActivity());
        developer.execute();

        developer.setActivity(new ReadActivity());
        developer.execute();

        developer.setActivity(new TrainActivity());
        developer.execute();
    }
}
