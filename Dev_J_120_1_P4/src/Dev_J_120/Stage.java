
package Dev_J_120;

public enum Stage {
    
    BACHELOR("bachelor"),
    MASTER("master");
    
    private final String stage;

    private Stage(String stage) {
        this.stage = stage;
    }
    public String getStageString() {
    return stage;
    }
}
