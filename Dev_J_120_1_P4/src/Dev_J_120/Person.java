
package Dev_J_120;


import java.util.Collection;

public abstract class Person {
    
    private String name;
    private String department;
    private Gender gender;

    public Person(String name, Gender gender, String department) {
        setName(name);
        setDepartment(department);
        setGender(gender);
    }
    /* По заданию 120 курса: статический метод printAll(Collection<? extends Person collection), 
    печатающий данные обо всех персонах, содержащихся в заданной коллекции типа Collection<Person>.*/
    public static void printAll(Collection<? extends Person> collection){
        collection.forEach(Person::print); 
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name != null && !name.trim().isEmpty()) 
            this.name = name.trim();
        else
            throw new IllegalArgumentException("Не указаны обязательные данные: фамилия и имя");
        
    }
    public String getDepartment() {
        return department;
    }
    public final void setDepartment(String department) {
        if (department != null && !department.trim().isEmpty()) 
            this.department = department.trim();
        else
            throw new IllegalArgumentException("Не указаны обязательные данные: название факультета");
        
    }
    public Gender getGender() {
        return gender;
    }
    public final void setGender(Gender gender) {
        if(gender != null)
            this.gender = gender;
        else    
            throw new IllegalArgumentException("Не указаны обязательные данные: пол человека");
        
    }
    public static void printAllFromArray(Person[] persons) {
        
        for(Person pers : persons) {
            if(pers instanceof Teachers)                
                System.out.printf("Type of person: teacher        Name: %-15s   Gender: %-6s   Department: %-16s   Specialty: %-21s   Degree: %s%n",
                        pers.getName(), pers.getGender().getGenderString(), pers.getDepartment(), ((Teachers)pers).getSpecialty(), ((Teachers)pers).getDegree().getDegreeString());
            
            else if(pers instanceof Students) 
                System.out.printf("Type of person: student        Name: %-15s   Gender: %-6s   Department: %-16s   Stage: %-10s   Number of course: %d%n",
                        pers.getName(), pers.getGender().getGenderString(), pers.getDepartment(), ((Students)pers).getStage().getStageString(), ((Students)pers).getCourseNumber());
            
            else if(pers instanceof Aspirant) 
                System.out.printf("Type of person: postgraduate   Name: %-15s   Gender: %-6s   Department: %-16s   Thesis title: %-10s%n",
                        pers.getName(), pers.getGender().getGenderString(), pers.getDepartment(), ((Aspirant)pers).getThesisTitle());
            else
                System.out.println("Этот товарищ не из нашего ВУЗа. Шутка");
        }    
    }

    public abstract void print();
}


