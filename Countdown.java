/** Required package class namespace */
package finalprojectcs40s;
 
/**
 * Countdown.java - Begins the countdown to the beginning of the game
 *
 * @author Michelle Galinsky
 * @since May 22, 2024
 */
public class Countdown 
{
    
    /**
     * Default constructor, set class properties
     * @param count
     * @return 
     */
    public int Countdown(int count) {
        if(count == 0){
            return 0;
        }
        else{
            //print?
            System.out.println(count);
            return Countdown(count - 1);
        }
    }
    
}
