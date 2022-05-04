
package Dev_J_120;

public enum Gender {
    
    M("male"),
    F("female");
    
    private final String gender;
    
    private Gender(String gender) {
        this.gender = gender;
    }
    public String getGenderString() {
        return gender;
    }
}
