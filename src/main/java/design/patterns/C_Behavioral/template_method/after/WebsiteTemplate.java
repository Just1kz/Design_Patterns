package design.patterns.C_Behavioral.template_method.after;

public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        getContent();
        System.out.println("Footer");
    }

    public abstract void getContent();
}
