package testing;

import classes.Apple;
import classes.Athlete;
import classes.Box;
import classes.DiskJockey;
import classes.Doctor;
import classes.Food;
import classes.House;
import classes.Husky;
import classes.Meeting;
import classes.MrWachs;
import classes.Teacher;
import classes.Person;
import classes.Piper;
import classes.Steak;
import classes.Student;
import javax.swing.JOptionPane;

/**
 * AdvancedClassesTest - tests the concepts learned in this unit.
 * 
 * @author m.galinsky
 * @since Mar 12, 2024
 */
public class AdvancedClassesTest {
    
    /**
     * Default constructor method, it sets class properties.
     * 
     * Special Methods that have the same name as the class (including a
     * capital at the start of the name) and NO return type (not even "void")
     * are called "constructor" methods these methods are called when the class
     * is created (or constructed), it makes an object from the class, or it
     * instantiates the class (creates an "instance")
     */
    public AdvancedClassesTest() {
        System.out.println("Start Learning Advanced classes...");
        
        // Using the class to create an object with the default constructor:
        // class object = call constructor method (default)   
        Person person = new Person();
        
        // The "Object" (in this case called "person" - lowercase "p") can also 
        // be called a: instance, or even a "variable"
        
        // Call (invoke) one of our methods in this object ("instance") 
        person.talk();
        
        person.name = "Per Soney";
        
        // Recall our method... (to see any changes)
        person.talk();
        
        // Try to call (invoke) some of our other methods:
        person.birthday();
        person.talk();
        person.die();
        person.talk();
        
        // If I try to change ("modify") a property ("variable") of the
        // Person class that is modified to be "private" I do NOT have
        // access to that - for example:
        // person.gender = "male";
        
        // Try our overloaded, second constructor option
        Person john = new Person("John Doe", 63, "male");
        john.talk();
        
        // Instantiate (means create an "instance of") a student object
        Student student = new Student();
        student.talk();
        // Because the "name" property (inherited from Person) is public (not
        // encapsulated) we can change ("modify", "mutate") the property
        // we cannot change gender because it is encapsulated (private)
        student.name = "Stu Denty";
        // We can also change some of the properties just for student (even
        // though they are encapsulated) by going through the methods that 
        // change them
        student.talk();
        student.birthday();
        student.talk();
        
        // Instantiate (means "create and instance of") a second Student 
        // object (instance)
        Student stewie = new Student("Stewie Griffin", 1, "male", 100);
        stewie.talk();
        stewie.study();
        stewie.talk();
        stewie.slackoff();
        stewie.talk();
        stewie.cram();
        stewie.talk();
        stewie.die();       // Inherited method from Person (parent/super) class
        stewie.talk();
        // stewie.secret(); // you cannot call encapsulated methods!
        
        // Instantiate a teacher object and associate it with a student object
        Teacher teacher = new Teacher("Ms. Teachery");
        teacher.talk();                 // Invoke (call) the inherited method
        teacher.add(student);           // Associate object through method
        teacher.add(stewie);            // or "Teacher has a Student"
        teacher.talk();                 // Call again (to see any changes)
        teacher.teach();                // Effect the associated objects
        teacher.birthday();             // See any more "effects" from 
        teacher.talk();                 // calling these methods...  
        teacher.die(); 
        teacher.talk();
        // See if the teacher object effeced its associated class objects
        // those being the two student objects...
        student.talk();
        stewie.talk();
        
        // The Object class - this class already exists (we don't write it)
        // it is part of Java, all Java project "have it". Also, the
        // Object class is the parent (super) class of ALL classes
        
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object2;
        
        // All classes (including ones we create) inherit from the object class
        // which is the parent (super) class of all classes 
        
        // Built into the object class are a number of methods that all other
        // classes inherit. These include some that are not relevant in this 
        // unit, and others like the: 
        //      toString()
        //      equals()
        //      clone()
        
        // The toString() method of the object class outputs information
        // including the memory address (in hexadecimal code) where this object
        // is stored in this computer's memory  
        
        System.out.println("O1 = " + object1.toString());
        System.out.println("O2 = " + object2.toString());
        System.out.println("O3 = " + object3.toString());
        
        // The method (toString) is inherited by ALL sub classes (children)
        // of the Object class - remember the Object class is the parent or
        // super class of ALL classes - so they all inherit toString, including
        // classes we write...
        
        System.out.println("Person  as a string = " + person.toString());
        System.out.println("Student as a string = " + student.toString());
        System.out.println("Teacher as a string = " + teacher.toString());
        
        // Since the object class is also the super class of classes we DON'T
        // write but are already part of java, they also inherit toString...
        
        String string = new String("squirrel");
        System.out.println("String as a string = " + string.toString());
        
        // Another example of "built-in" Java class (actually imported)
        // level object that inherits all the methods (including toString)
        // from the Object class...
        JOptionPane joptionpane = new JOptionPane();
        System.out.println("JOptionPane as a string = " + joptionpane.toString());
        
        // The equals() method of the object class checks if two objects are
        // "equal" by using the "memory address" of each object and checks if 
        // the two objects being compared use the same address (true) or not 
        // (false)
        if (object1.equals(object2)) System.out.println("O1==O2");
        if (object2.equals(object3)) System.out.println("O2==O3");
        if (object1.equals(object3)) System.out.println("O1==O3");
        
        // Now we will create 3 identifier names, but only one memory location
        // for all three
        Person person1 = new Person();  // Creating a "new" memory address
        Person person2 = person1;       // Same memory address as person1
        Person person3 = person2;       // Same memory address as person1 and 2
        
        if (person1.equals(person2)) System.out.println("P1==P2");
        if (person2.equals(person3)) System.out.println("P2==P3");
        if (person1.equals(person3)) System.out.println("P1==P3");
        
        // Using our previously created Person objects with equals
        if (person.equals(john)) System.out.println("person==john");
        
        // Now test "equals" with Student objects, and we will be over-riding 
        // the equals method in the student class....        
        Student student1 = new Student("1", 0, "1", 1);
        Student student2 = new Student("2", 0, "2", 2);
        Student student3 = new Student("3", 0, "3", 1);
        if (student1.equals(student2)) System.out.println("S1==S2");
        if (student2.equals(student3)) System.out.println("S2==S3");
        if (student1.equals(student3)) System.out.println("S1==S3");
        
        // Have over-ridden the toString() and equals() methods in the
        // person class so that we can check how that method is called over the 
        // object version of those methods. It is useful to alter a NetBeans
        // template so those methods are always over-ridden in every new class 
        // created (see the comment in "ComputerScience40S.java" to do this). 
        // Now we also over-ride the clone method
        
        // Testing our clone() method:
        Student clone1 = student.clone();
        Student clone2 = stewie.clone();
        System.out.println("Student = " + student.toString());
        System.out.println("Stewie  = " + stewie.toString());
        System.out.println("Clone 1 = " + clone1.toString());
        System.out.println("Clone 2 = " + clone2.toString());
        
        // Using a static variable, static variables get instantiated once and
        // all objects share a reference to that same memory location (meaning
        // the "static" variable "belongs" to the class not the object)
        
        // Now output the static variable of each object and you will notice
        // how we get the same output for each student instance as they all
        // "share" the same access to the same static variable  
        System.out.println("S1 total = " + student1.total);
        System.out.println("S2 total = " + student2.total);
        System.out.println("S3 total = " + student3.total);
        
        // We create (instantiate) 2 more Student objects...
        Student student4 = new Student();
        Student student5 = new Student("5", 5, "5", 5);
        
        // And output the shared/static property of those new instances
        System.out.println("S4 total = " + student4.total);
        System.out.println("S5 total = " + student5.total);
        
        // Mutate (change) that static variable directly (in one instance)
        stewie.total = 10;
        
        // Output the static variable again - showing that it changed (mutated) 
        // ALL the instances (all the student obejcts) since that varaible is
        // modified to be static  
        System.out.println("Stewie total = " + stewie.total);
        
        // Now we will call a static (shared) method from the objects 
        // (instances) of the Person class and the other classes that extend
        // ("is a") from Person and inherited this method
        person.endTheWorld();
        student.endTheWorld();
        teacher.endTheWorld();
        
        // You can invoke (call) static methods from the name of the class 
        // itself, not just the instances (objects) of the class, for example
        Person.endTheWorld();
        Student.endTheWorld();
        Teacher.endTheWorld();
        
        // You have seen calling method like this before, for example in
        // JOptionPane.showMessageDialog(null, "");
        // Not doing this...
        // JOptionPane jop = new JOptionPane();
        // jop.showMessageDialog(null,"");
        
        // When we call static methods from the instances, the 
        // autocomplete/intellisense will not show it - but it does show it in
        // autocomplete/intellisense from the Class name
        
        // The "protected" modifier means this property of the Person class
        // cannot be accessed from this class because this class is not 
        // related to this class through inheritance (it is only related
        // through association)
        // person.alive = false;
        
        // Calling an accessor (or getter) method on this object of the Person
        // class (which is a private, encapsulated property)
        System.out.println("Gender = " + person.getGender());
        
        // Calling a mutator (or setter) method on this object which is a
        // protected property
        person.setAlive(false);
        System.out.println("Person alive = " + person.getAlive());
        
        // Instatiate (make an "instance" aka "object of that class)...
        Doctor     doctor     = new Doctor();
        DiskJockey diskJockey = new DiskJockey();
        MrWachs    mrWachs    = new MrWachs();
        Husky      husky      = new Husky();
        Piper      piper      = new Piper();
        Athlete    athlete    = new Athlete();
        // Intentially leaving out "HighSchool"
        
        // Output these new objects, the "toString()" method is automatically 
        // called by System.out.println() so we can just pass the object itself
        System.out.println(doctor);
        System.out.println(diskJockey);
        System.out.println(mrWachs);
        System.out.println(husky);
        System.out.println(piper);
        System.out.println(athlete);
        
        // Instantiate ("make an instance of") a meeting object (of that class)
        Meeting meeting = new Meeting();
        
        // Have person objects (instances of the Person class) and all 
        // children objects (classes that inherit from Person) will attend
        // the meeting - through the concept of polymorphism 
        meeting.attend(person);
        meeting.attend(john);        
        meeting.attend(person1);
        meeting.attend(person2);
        meeting.attend(person3);
        meeting.attend(clone1);
        meeting.attend(clone2);        
        meeting.attend(student);
        meeting.attend(stewie);
        meeting.attend(student3);
        meeting.attend(student4);
        meeting.attend(student5);        
        meeting.attend(teacher);
        meeting.attend(doctor);
        meeting.attend(diskJockey);
        meeting.attend(mrWachs);
        meeting.attend(piper);
        meeting.attend(husky);
        meeting.attend(athlete);
        
        // Need to "hold a meeting" of all members
        meeting.hold();
        
        
        // Abstract classes can NOT ever be instantiated, for example:
        // HighSchool highSchool = new HighSchool();
        // Food food = new Food();
        
        // Instantiate an object from a child class of an abstract class
        // using the abstract methods (that were made 'concrete') in that class 
        
        Apple apple = new Apple();
        apple.smell(2);
        
        Steak steak = new Steak();
        steak.smell(6);
        
        // Call the polymorphic method which accepts the abstract object (Food)
        // as an argument. Since the abstract class cannot be instantiated,
        // only children objects from the abstract class can be arguments
        // (in other words, apple and steak instances)
        
        mrWachs.consume(steak);
        husky.consume(apple);
        
        // An Interface can be thought of "as a set of rules" - like a class
        // but only contains method signatures (like abstract methods - but
        // you don't have to use the word 'abstract' inside interfaces).
        // Interfaces cannot be instantiated (made into objects like
        // Sports sports = new Sports(); like abstract classes). Like an
        // abstract class, interfaces are used by 'child' like classes that
        // 'implement' the interface (these classes "follow the rules" of
        // the interface ("the set of rules").
        
        Athlete jock = new Athlete();
        // Set our opponent 
        jock.setOpponent("St. Pauls");
        // Have our athlete compete in four rounds of athletics
        for (int round = 1; round <= 4; round++) {
            System.out.println("Round " + round + "...");
            if (jock.haveYouGotItSigned()) {            // Check if can play?
                jock.score("Jock");                     // Play hockey
                jock.score("Jock");
                jock.score("St. Pauls");
                jock.endOfPeriod(round);                // See the scores...
                if (round == 2) {
                    jock.score("Jock");
                    jock.endGame();
                }
            }
            else {
                jock.sign();        // Sign so they can play
            }
        }
        // Check if we won
        if (jock.didIWin()) jock.consume(steak);
        
        // A generic is defined as a characteristic of or relating 
        // to a class or group of things that is not specific. In 
        // Java, we can use generic methods and generic classes
        
        // Let us start by creating simple ("primitive") data types 
        boolean b = true;
        char    c = 'a';
        int     i = 0;
        double  d = 3.14;
        
        // Now use the primatives with a more complex data type (class)
        // called a 'wrapper' class from the primatives and use the 
        // constructor methods of those wrapper classes passing the 
        // primatives through the constructor methods 
        Boolean   bool      = new Boolean(b);
        Integer   integer   = new Integer(i);
        Double    doub      = new Double(d);
        Character character = new Character(c);
        
        // Also String (which was always 'complex' using the captial 'S'
        // to declare it) and its constructor method (usually not needed)..
        String string1 = new String("test");
        
        // Now call a generic method on the variety of 'generic' items
        output(bool);
        output(integer);
        output(doub);
        output(character);
        output(string1);
        output(athlete);        // Even objects of classes we created
        
        // Test the generic method on another "complex" object (that we don't
        // create)...
        JOptionPane jOptionPane = new JOptionPane();
        output(jOptionPane);
        
        // This line uses "annonymous" object..
        output(new Object());
        
        // When using a class with a generic inside of it, and that
        // class is being instantiated (creating an object), then 
        // you define what type the generic is by using the angle 
        // brackets "< >" with the data type (which must be a 
        // 'class' type not a primitive) inside the brackets beside 
        // the class name on the left hand side of the equals sign. 
        // This is repeated on the right hand side of the equals 
        // sign as well (but you can leave these angle brackets 
        // empty - which is called the "diamond") before the round 
        // brackets of the constructor method.
        Box<Boolean>   box1 = new Box<>(bool);
        Box<Integer>   box2 = new Box<>(integer);
        Box<Double>    box3 = new Box<>(doub);
        Box<Character> box4 = new Box<>(character);
        Box<String>    box5 = new Box<>(string1);
        Box<Athlete>   box6 = new Box<>(athlete);
        
        // Peek in all the boxes..  
        box1.peek();
        box2.peek();
        box3.peek();
        box4.peek();
        box5.peek();
        box6.peek();
        
        // Open all the boxes...        
        Boolean   newBoolean   = box1.open();
        Integer   newInteger   = box2.open();
        Double    newDouble    = box3.open();
        Character newCharacter = box4.open();
        String    newString    = box5.open();
        Athlete   newAthlete   = box6.open();
        
        // Output all the newly returned data type objects...
        output(newBoolean);
        output(newInteger);
        output(newDouble);
        output(newCharacter);
        output(newString);
        output(newAthlete);
        
        // A generic class with multiple generic types, a generic method, the
        // enhanced for loop, restricted generics 
        House<MrWachs,Meeting> house = new House<>();
        
        // Associate the objects that match with the generics
        house.homeOwner = mrWachs;
        house.contents  = meeting;
        
        // Create an array of Food object
        Food[] fridge = { apple, steak };
        
        // Test our generic method
        house.party(fridge);
        
        
        
        System.out.println("Completed Learning Advanced classes!");
    }

    /**
     * Outputs a generic item with information about the data type.
     * Generic methods use 'generic' references rather than specific
     * references. You do not define the data type (the parameter) 
     * when the method is created. Instead of defining the data
     * type, a set of angle brackets "< >" is used with a single
     * letter (usually capital "T") inside which acts as a 
     * 'placeholder' for the data type which will be defined in
     * the argument when the method is later called
     * 
     * @param <T> the generic type used
     * @param item the item to output
     */
    private static <T> void output(T item) {
        String text = "Class name: ";
        text += item.getClass().getSimpleName();
        text += ", Hash Code: " + item.hashCode();
        text += ", To String: " + item.toString();
        System.out.println(text);
    }
}
