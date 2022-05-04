
package Dev_J_120;

public class Teachers extends Person {
    
    private String specialty; //название специальности
    private Degree degree;    //ученая степень

    public Teachers(String name, Gender gender, String department, String specialty, Degree degree) {
        super(name, gender, department);
        setSpecialty(specialty);
        setDegree(degree);
    }

    public String getSpecialty() {
        return specialty;
    }

    public final void setSpecialty(String specialty) {
       if (specialty != null && !specialty.trim().isEmpty()) 
            this.specialty = specialty.trim();
        else
           throw new IllegalArgumentException("Не указаны обязательные данные: специальность преподавателя");
        
    }

    public Degree getDegree() {
        return degree;
    }

    public final void setDegree(Degree degree) {
        if(degree != null)
           this.degree = degree; 
        else
            throw new IllegalArgumentException("Не указаны обязательные данные: ученая степень преподавателя");        
    }
    //переопределенный метод print()
    @Override
    public void print() {
        
        String first = "This is " + super.getName() + ". ";
        if(super.getGender() == Gender.M)
           System.out.println(first + "He teaches " + super.getDepartment() + ". " + "He has " + degree.getDegreeString() + " degree in " + this.specialty + ".");  
        else
           System.out.println(first + "She teaches " + super.getDepartment() + ". " + "She has " + degree.getDegreeString() + " degree in " + this.specialty + ".");   
        
    }     
}


