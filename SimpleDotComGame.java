package GameDotCom;

public class SimpleDotComGame {
  
  public static void main(String[] args) {
  
    int numOfGuesses = 0;
  
    GameHelper helper = new GameHelper();
  
    SimpleDotCom theDotCom = new SimpleDotCom();
  
    int randomNum = (int) (Math.random() * 5);
  
    int[] locations = {randomNum, randomNum+1, randomNum+2};
  
    theDotCom.setLocationCells(locations);
  
    boolean isAlive = true;
  
    while(isAlive == true) {
      
    String guess = helper.getUserInput("Inclua um Número: ");
  
    String result = theDotCom.checkYourSelf(guess);
  
    numOfGuesses++;
    
    if (result == "Kill") {
         isAlive = false;
             
         System.out.println("Voce Utilizou " + numOfGuesses + "palpites");
         }
      }
   }
}