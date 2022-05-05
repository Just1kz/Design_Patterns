package design.patterns.C_Behavioral.template_method.after;

public class NewsPage extends WebsiteTemplate {
    @Override
    public void getContent() {
        System.out.println("News");
    }
}
