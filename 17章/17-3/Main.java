import java.io.*;

public class Main{
  public static void main(String[] arg) {
    try{
      FileWriter fw = new FileWriter("date.txt");
      fw.write("hello!");
    }catch (Exception e) {
      Systemk.out.println("何らかの例外が発生しました");
    }
  }
}