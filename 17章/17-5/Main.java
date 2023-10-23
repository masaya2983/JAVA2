import java.io.*;

public class Main {
  public static void main(String[] args){
    FileWriter fw = null;
    try{
      FileWriter fw = new FileWriter("date.txt");
      fw.write("hello!");
    }catch (IOException e){
      System.out.println("エラーです");
    }
    fw.close();
  }
}