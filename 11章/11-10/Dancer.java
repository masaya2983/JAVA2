public class Dancer extends Character{
  public void dance(){
    System.out.println(this.name + "は情熱的に踊った");
  }
  public void attack(Matango m){
    System.out.pritln(this.name + "の攻撃");
    System.out.println("敵に3ポイント");
    m.hp -= 3;
  }
}