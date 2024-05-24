/** Required package class namespace */
package finalprojectcs40s;

import javax.swing.JOptionPane;


/**
 * FinalProjectCS40S - description
 * 
 * @author Michelle Galinsky
 * @since May 16, 2024
*/
public class FinalProjectCS40S
{
    public static String title = "";

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //NewJFrame newJFrame = new NewJFrame();
        
        NewJDialog newJDialog = new NewJDialog(null, true);
        
        
        String text = JOptionPane.showInputDialog(null, 
                "When would you like to begin?", title, 
                JOptionPane.PLAIN_MESSAGE);
         
        int count = Integer.parseInt(text);
        
        Countdown countD = new Countdown();
        countD.Countdown(count);
        
        Hero hero = new Hero();
        
        final String[] CHOICES = {
            "Fighter with the properties: " + hero.fighter(),
            "Wizard with the properties: " + hero.wizard(),
            "Superhero with the properties: " + hero.superhero(),
            "Ninja with the properties: " + hero.ninja()
        };
        
        String choice = JOptionPane.showInputDialog(null, "Select:", "", 
                JOptionPane.QUESTION_MESSAGE, null, CHOICES, CHOICES[0]).toString();
        if (choice.equals(CHOICES[0])) {
            hero.fighter();
        }
        else if (choice.equals(CHOICES[1])) {
            hero.wizard();
        }
        else if (choice.equals(CHOICES[2])) {
            hero.superhero();
        }
        else{
            hero.ninja();
        }
        
        //String selection = choices(CHOICES);
    }

//    private static String choices(String[] choices) {
//        
//        Object object = JOptionPane.showInputDialog(null, title, 
//                JOptionPane.PLAIN_MESSAGE, null, choices[0]);
//        if (object == null)  return "";                 // User selects "X"
//        else                 return object.toString();  // Return user's choice
//        
//        return "";
//    }
}