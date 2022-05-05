package design.patterns.C_Behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("first");
        jobSite.addVacancy("second");

        Observer first = new Subscriber("Anton");
        Observer second = new Subscriber("Peter");

        jobSite.addObserver(first);
        jobSite.addObserver(second);

        jobSite.addVacancy("third");
        System.out.println("----------------------------------------------");
        jobSite.removeVacancy("first");
    }
}
