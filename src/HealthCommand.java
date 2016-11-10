import java.util.Scanner;

/**
 * University of Mary Washington
 * CPSC 240 Section 2
 * 
 */

/**
 * @author Michelle Booth
 */
public class HealthCommand extends Command {
   /**
   * Health of user
   */
   private int health;
    /**
    * Gives the HealthCommand an int health
	 * @param health int
	 */
   HealthCommand(int health){
      this.health = health;
   
   }
   /*
   * Gets the health and returns the health message
   * @return String The message that corrosponds to the health
   */
   String execute(){
      return "health message";
   } 

}