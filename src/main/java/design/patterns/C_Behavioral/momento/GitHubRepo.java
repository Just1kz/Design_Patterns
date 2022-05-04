package design.patterns.C_Behavioral.momento;

/**
 * Можно также сделать набор сохраненных состояний хранив коллекцию
 *  в данном примере сделал 1 состояние
 */
public class GitHubRepo {
    private MementoProject mementoProject;

    public MementoProject getMementoProject() {
        return mementoProject;
    }

    public void setMementoProject(MementoProject mementoProject) {
        this.mementoProject = mementoProject;
    }
}
