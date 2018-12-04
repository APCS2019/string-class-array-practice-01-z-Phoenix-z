//past paper 2015
//key idea : String and class

public class Hiddenword(){
private String puzzle;

public Hiddenword (String a){
  puzzle = a;
}

public String getHint (String guess){
String a = "";
for (int i = 0; i < guess.length();i++){
  if (puzzle.substring(i,i+1).equalsTo(guess.substring(i,i+1))){
  a.substring(i,i+1) = guess.substring(i,1+1);
  }
  else if (puzzle.indexOf(guess.substring(i,i+1)) != -1){
  a.substring(i,i+1) = "+"
  }
  else{
  a.substring(i,i+1) = "*"
  }
}
  return a;
}
