/** Required package class namespace */
package classes;
 
/**
 * House.java - description
 *
 * @author Michelle Galinsky
 * @since May 13, 2024
 */
public class House <T extends Person, U>
{

    /**
     * The generic owner of this house (must be a Person object or any children
     * of that class)
     */
    public T homeOwner;
    
    /**
     * The generic contents in this house. Since this is a different generic 
     * object, a different letter is used (again it can be any letter you want)
     */
    public U contents;
    
    
    /**
     * Generic method that has the home owner consume all the generic 
     * restricted Food (all all Food children) items that are passed in an 
     * array
     *
     * @param <V> Food objects (or children of the Food class)
     * @param items the array of generic items that are Food
     * objects or children of the Food class
     */
    public <V extends Food> void party(V[] items) {
        System.out.println("Home Owner:");
        System.out.println(homeOwner.name);
        System.out.println("And the contents...");
        System.out.println(contents.toString());
        // Enhanced for loop ("For every item in items")
        for (V item : items) {
            homeOwner.consume(item);
        }
    }
}
