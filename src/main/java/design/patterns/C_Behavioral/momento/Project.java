package design.patterns.C_Behavioral.momento;

import java.util.Date;

public class Project {
    private String version;
    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public MementoProject saveProject() {
        return new MementoProject(version, date);
    }

    public void loadProject(MementoProject mementoProject) {
        this.version = mementoProject.getVersion();
        this.date = mementoProject.getDate();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
