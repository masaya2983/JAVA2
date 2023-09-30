public class SuperHero extends Hero{
  
  public void attack(Matango m){
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージをあたえた!");
    if (this.flying){
      System.out.println(this.name + "の攻撃！");
      m.hp -= 5;
      System.out.println("5ポイントのダメージをあたえた！");
    }
    
  }
}