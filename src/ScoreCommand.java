/**
 * University of Mary Washington
 * CPSC 240 Section 2
 * 
 */

/**
 * @author Michelle Booth
 */
public class ScoreCommand extends Command {
   /**
   * Score of user
   */
   private int score;
    /**
    * Gives the ScoreCommand an int score
	 * @param score int
	 */
   ScoreCommand(int score){
      this.score = score;
   
   }
   /*
   * Gets the score and returns the rank
   * @return String The rank that corrosponds to the score
   */
   String execute(){
      return "score message";
   } 
}
