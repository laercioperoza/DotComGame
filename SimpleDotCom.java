package GameDotCom;

class SimpleDotCom {
  int[] locationCells;
  int numOfHits = 0;
  
  void setLocationCells(int [] loc){
    locationCells = loc;
  }
        
        public String checkYourSelf(String stringGuess){
         int guess = Integer.parseInt(stringGuess);
         String result = "Missed";
         
          for (int cell : locationCells){
            if (guess == cell){
              result = "Hit";
              this.numOfHits++;
              break;
            }         
          }
          if (numOfHits == locationCells.length){
              result = "Kill";
            }
            System.out.println(result);
            return result;
          }
        }