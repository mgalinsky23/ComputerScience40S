/** Required package class namespace */
package finalprojectcs40s;
 
/**
 * Hero.java - the users will choose the hero type they want from 
 * these descriptions
 *
 * @author Michelle Galinsky
 * @since May 23, 2024
 */
public class Hero implements HeroType
{
    
    public int fight;
    public int magic;
    public int stealth;
    public int speed;
    

    @Override
    public String fighter() {
        fight = 15;
        speed = 10;
        magic = 0;
        stealth = 5;
        return toString(fight, speed, magic, stealth);
    }

    @Override
    public String wizard() {
        fight = 5;
        speed = 5;
        magic = 15;
        stealth = 0;
        return toString(fight, speed, magic, stealth);
    }

    @Override
    public String superhero() {
        magic = 10;
        fight = 15;
        stealth = 10;
        speed = 5;
        return toString(fight, speed, magic, stealth);
    }

    @Override
    public String ninja() {
        stealth = 10;
        fight = 5;
        speed = 15;
        magic = 0;
        return toString(fight, speed, magic, stealth);
    }
    
    
    public String toString(int fight, int speed, int magic, int stealth){
        String output = "Fight = " + fight;
        output += "     Speed = " + speed;
        output += "     Magic = " + magic;
        output += "     Stealth = " + stealth;
        return output;
    }

    
}
