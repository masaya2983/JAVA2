import java.io.*;

public class Main{
  public static void main(String[] args){
    FileWriter fw;
    try{
      fw = new FileWriter("date.txt");
      fw.write("hello!");
    }catch{
      System.out.println("何らかの例外が発生しました");
    }finally{
      fw.close();
    }
  }
}