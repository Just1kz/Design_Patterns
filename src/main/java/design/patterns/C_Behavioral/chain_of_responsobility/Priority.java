package design.patterns.C_Behavioral.chain_of_responsobility;

public enum Priority {
    ROUTINE(1),
    IMPORTANT(2),
    ASAP(3);

    private int level;

    Priority(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
