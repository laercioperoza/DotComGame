package GameDotCom;

public class SimpleDotComTestDrive {
  public static void main(String[] args){
    
    SimpleDotCom dot = new SimpleDotCom();
    
    int[] locations = {1,2,3};
    
    dot.setLocationCells(locations);
    
    String userGuess = "2";
    
    String result = dot.checkYourSelf(userGuess);
    
  }
}
    