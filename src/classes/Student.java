
/** Required package class namespace */
package classes;


/**
 * Student.java - represents a student, reminder that "extends" causes
 * inheritance (or "is a") meaning this class gets all the properties and
 * methods of it's parent (super) class. The line below is called the 
 * "signature" line for this class. If we add the "modifier" word "extends" 
 * it causes inheritance and then the class it inherits from is typed next. 
 * This is a "is a" relationship, so a "Student is a Person", and this class  
 * inherits all properties and methods from the "parent" (super) class. 
 *
 * @author m.galinsky
 * @since April 5, 2024
 */
public class Student extends Person
{

    /**
     * Represents a book object (this object "has a" relationship (association)
     * or "usage" with the student class
     */
    public Book book;
    
    private int number;     // Class properties (and inherited other properties)  
    private double gpa;     // Encapsulated property
    
    /**
     * "static" property: the modifier word "static" simply means "shared" 
     * meaning that ALL objects of this class share this ONE instance of this
     * variable
     */
    public static int total;
    
    
    
    /**
     * Default constructor, set class properties (including a call to the 
     * "super-constructor" from the parent class to set all of its properties 
     * as well)
     */
    public Student() {
        super();
        // The keyword "super" refers to the "super-class" or "parent" class
        // in this case that is the Person class - by adding the round brackets
        // we make a call to the super constructor           
        gpa    = 0.0;
        number = 1;
        book   = new Book();
        // Change ("mutate") the static ("shared") property ("global variable")
        total++;
    }
    
    /**
     * Constructor for the class, sets class properties
     * 
     * @param name the name for this student
     * @param age the age for this student
     * @param gender the gender for this student
     * @param number the student number for this student
     */
    public Student(String name, int age, String gender, int number) {
        // Use the super constructor in the parent class (Person) to modify
        // (change) the encapsulated (private) properties on that super class
        // this sets all the properties of the parent (Person) object that 
        // the child (Student) cannot set
        super(name, age, gender);      
        // Now set the properties of "this" (the Student) class...
        gpa    = 0.0;
        this.number = number;
        book   = new Book();
        total++;
    }
    
    /**
     * Studying raises this student's average
     */
    public void study() {
        gpa += 0.3;
    }
    
    /**
     * Slacking off lowers this student's average
     */
    public void slackoff() {
        gpa -= 0.3;
    }
    
    /**
     * Cramming is intense studying
     */

    public void cram() {
        for (int i = 0; i < 10; i++) {
            study();
        }
        secret();     // We call a private, encapsulated, helper, utility method
    }
    
    /**
     * This "secret" method is a private, encapsulated method. These types of 
     * methods are sometimes called "helper" or "utility" methods as they can
     * only be called by other methods inside this class
     */
    private void secret() {
        gpa *= 1.0001;
    }
    
    /**
     * Talk is an "over-ride" (not overload) method means it when called will 
     * run its code and not the code from the method it inherited. The "comment"
     * the light bulb suggested "@Override" is a signal to NetBeans that 
     * a method over-ride is taking place - this is also seen in NetBeans with 
     * a target-like circle
     */
    @Override
    public void talk() {
        super.talk();                             // Invoking super class method
        
        System.out.println("I am a student");
        System.out.println("\t My student number: \t" + number);
        System.out.println("\t GPA: \t" + gpa);
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     * 
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        // The parameter "object" is not yet a "Student", so we will
        // "cast" it into a Student with round brackets
        Student that = (Student)object;
        // Compare some of the properties of each student object
        if (this.alive  != that.alive)  return false;
        if (this.age    != that.age)    return false;
        if (this.gpa    != that.gpa)    return false;
        if (this.number != that.number) return false;
        // We could compare more (go "deeper") in the comparison
        // We are in charge of the equals method
        return true;
    }
    
    /**
     * Deep clone, create a duplicate object (has all the same properties) as 
     * "this" object using "new" memory
     * 
     * @return a "clone" of the object using new memory
     */
    @Override
    public Student clone() {
        // Created a new Student object using new memory
        Student that = new Student();
        // Start copying over all the properties
        that.number = this.number;
        that.book   = this.book;
        that.gpa    = this.gpa;
        // Also, clone properties from the "super" class (Person) that
        // I want to (I am in charge of this method)
        that.name  = this.name;
        that.age   = this.age;
        that.alive = this.alive;
        // Private properties are still encapsulated
        //that.gender = this.gender;
        return that;
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "Student " + super.name + ", " + super.age +
               "," + this.number + "," + gpa;
    }
    
}
