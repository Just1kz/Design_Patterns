package design.patterns.C_Behavioral.state;

public class DeveloperDay {
    public static void main(String[] args) {
        Activity activity = new SleepActivity();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for(int x = 0; x <10; x++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
