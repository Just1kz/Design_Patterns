package design.patterns.C_Behavioral.template_method.after;

public class Main {
    public static void main(String[] args) {
        WelcomePage welcomePage = new WelcomePage();
        NewsPage newsPage = new NewsPage();

        newsPage.showPage();

        System.out.println("\n==========================\n");

        welcomePage.showPage();
    }
}
