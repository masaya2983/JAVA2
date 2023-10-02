public class Character{
  String name;
  int hp;
  public void run(){
    System.out.println(this.name + "逃げ出した");
  } 
  public abstract void attac(Matango m)
}