import java.io*;

public class Main{
  public static void main(String[] args){
    try(FileWrite fw = new FileWriter("date.txt");){
      fw.Write("hello!");
    }catch (Exception e){
      System.out.println("何らかの例外が発生しました");
    }
  }
}