package design.patterns.C_Behavioral.momento;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitHubRepo gitHubRepo = new GitHubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Save current version to github");
        gitHubRepo.setMementoProject(project.saveProject());
        System.out.println();

        System.out.println("Write code.....");
        Thread.sleep(10000);
        System.out.println("Updating wrong Version 1.1");
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);
        System.out.println();

        System.out.println("Something went wrong on Testing, need rollback");
        project.loadProject(gitHubRepo.getMementoProject());

        System.out.println("Project after rollback");
        System.out.println(project);
    }
}
