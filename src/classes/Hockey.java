package classes;

/**
 * Hockey.java - enforcing "the rules" of hockey (and sports). Interfaces can
 * inherit from other interfaces ("can follow the rules of other rules"). This
 * is like classes inheriting from other classes.
 * 
 * @author m.galinsky
 * @since May 7, 2024
 */
public interface Hockey extends Sports
{
    void score(String name);
    void endOfPeriod(int period);
    
}
