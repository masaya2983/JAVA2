package calcapp.main;
public class Calc{
  public static void main(String[] args){
    int a = 10; int b = 2;
    int total = Calcapp.logics.CalcLogic.tasu(a,b);
    int delta = Calcapp.logics.CalcLogic.hiku(a,b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}