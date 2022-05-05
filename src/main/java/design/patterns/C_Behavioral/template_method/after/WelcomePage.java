package design.patterns.C_Behavioral.template_method.after;

public class WelcomePage extends WebsiteTemplate {
    @Override
    public void getContent() {
        System.out.println("Welcome");
    }
}
