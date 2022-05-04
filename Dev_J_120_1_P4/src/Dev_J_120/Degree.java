
package Dev_J_120;

public enum Degree {
    
    PHD("PhD"),
    MSC("MSc");
    
    private final String degree;
    
    private Degree(String degree) {
    this.degree = degree;
    }
    public String getDegreeString() {
        return degree;
    }
}
