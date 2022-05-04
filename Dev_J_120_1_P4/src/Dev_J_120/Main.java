package Dev_J_120;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        
        //Из задания 110 курса: Создайте массив и заполните его следующими данными:
        
        Person person1 = new Teachers("Ronald Turner", Gender.M, "Computer science", "Programming paradigms", Degree.PHD);
        Person person2 = new Teachers("Ruth Hollings", Gender.F, "Jurisprudence", "Domestic arbitration", Degree.MSC);
        Person person3 = new Students("Leo Wilkinson", Gender.M, "Computer science", Stage.BACHELOR, 3);
        Person person4 = new Students("Anna Cunningham", Gender.F, "World economy", Stage.BACHELOR, 1);
        Person person5 = new Students("Jill Lundqvist", Gender.F, "Jurisprudence", Stage.MASTER, 1);
        Person person6 = new Aspirant("Ronald Correa", Gender.M, "Computer science", "Design of a functional programming language.");
        
        Person[] personsArray = new Person[]{person1, person2, person3, person4, person5, person6};
       
        //Из задания 110 курса: Распечатайте содержимое массива. Метод printAllFromArray(Person[] personsArray).
        Person.printAllFromArray(personsArray);       
        System.out.println();
    
        // По заданию 120 курса....
        
        //создаем пустую коллекцию типа Students...
        Collection<Students> students1 = new ArrayList<>();
        //с помощью метода fillCollection(Collection<Students> заполняем созданную коллекцию из массива personsArray. В коллекцию попадают только студенты.
        Students.fillCollection(students1, personsArray);
        //печатаем ее методом printAll
        Person.printAll(students1); 
        System.out.println();
        
        /*создаем еще одну пустую коллекцию. Типом коллекции может являться любой super тип по отношению к Students,
        в данном случае Person. С Object тоже работает */
        Collection<Person> students2 = new ArrayList<>();
        //с помощью метода fillCollection(Collection<? super Students> заполняем созданную коллекцию из массива personsArray. В коллекцию попадают только студенты.
        Students.fillCollection(students2, personsArray);
        //еще раз печатаем методом printAll
        Person.printAll(students2); 
    }   
}

