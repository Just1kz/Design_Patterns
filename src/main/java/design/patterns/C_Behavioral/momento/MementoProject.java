package design.patterns.C_Behavioral.momento;

import java.util.Date;

public class MementoProject {
    private final String version;
    private final Date date;

    public MementoProject(String version, Date date) {
        this.version = version;
        this.date = date;
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
