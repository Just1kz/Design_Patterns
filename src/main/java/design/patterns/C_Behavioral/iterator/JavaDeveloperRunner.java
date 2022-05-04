package design.patterns.C_Behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Maven", "Git", "SQL", "PostgreSQL", "Hibernate"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Anton", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + "   ");
        }
    }
}
