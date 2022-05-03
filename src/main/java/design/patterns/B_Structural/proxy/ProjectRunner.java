package design.patterns.B_Structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        String url = "https://www.github.com/justikz/realproject";
        Project project = new RealProject(url);

        project.run();
        System.out.println("---------------------------------------------------------");
        //Создание ленивой загрузки с помощью прокси, скачивание проекта будет происходить только при запуске проекта, а не при создании объекта
        project = new ProxyProject(url);
        System.out.println("---------------------------------------------------------");
        //при создании объекта нет никаких действий
        //при вызове run() стартует и скачивание и старт проекта
        project.run();
    }
}
