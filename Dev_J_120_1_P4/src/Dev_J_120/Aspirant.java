
package Dev_J_120;

public class Aspirant extends Person {
    
    private String thesisTitle;

    public Aspirant(String name, Gender gender, String department, String thesisTitle) {
        
        super(name, gender, department);
        setThesisTitle(thesisTitle);
    }
    public String getThesisTitle() {
        return thesisTitle;
    }
    public final void setThesisTitle(String thesisTitle) {
        if (thesisTitle != null && !thesisTitle.trim().isEmpty()) 
            this.thesisTitle = thesisTitle.trim();
        else
            throw new IllegalArgumentException("Необходимо указать тему диссертации.");       
    }
    
    //переопределенный метод print()
    @Override
    public void print() {
        
        String stu = "studies ";
        String first = "This is " + super.getName() + ". ";
        if(super.getGender() == Gender.M)
           System.out.println(first + "He " + stu + super.getDepartment() + ". His thesis title is “" + thesisTitle + "“");  
        else
           System.out.println(first + "She " + stu + super.getDepartment() + ". Her thesis title is “" + thesisTitle + "“");   
    }   
}
