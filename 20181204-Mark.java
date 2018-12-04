//past paper 2015
//key idea : String and class

public class Hiddenword(){
private String puzzle;

public Hiddenword (){}


public String getHint (String guess){
String a = new String(puzzle.length()); 
for (int i = 0; i < guess.length();i++){
  if (puzzle.substring(i,i+1).equalsTo(guess.substring(i,i+1))){
  a.substring(i,i+1) = guess.substring(i,1+1);
  }
  else if (puzzle.indexOf(guess.substring(i,i+1)) != -1){
  a.substring(i,i+1) = "+"
  }
  else if (puzzle.indexOf(guess.substring(i,i+1)) == -1){
  a.substring(i,i+1) = "*"
  }
  return a;
}
}
