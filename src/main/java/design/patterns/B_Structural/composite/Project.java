package design.patterns.B_Structural.composite;

/**
 * В данном примере компоновщик собирает в себя объекты и хранит их в коллекции ArrayList
 *  Иллюстрируется древовидная структура где команда это голова а разработчики это листья/ветвления
 */
public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        team.writeCode();
    }
}
