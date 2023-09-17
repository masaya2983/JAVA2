public class Main{
  public static void main(String[]args){
    System.out.println("あなたの名前を入力してください");
    String name = new java.util.Scanner(Sytem.in).nextLine();
    int age = new java.util.Scanner(System.in).nextInt();
    System.out.println("ようこそ、" + age +"歳の" + name + "さん");
  }
}