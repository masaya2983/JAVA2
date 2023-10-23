import java.io.*;

public class Main {
  public static void main(String[] args){
     FileWriter fw = new FileWriter("date.txt");
    try{
     fw.write("hello!");
    }catch (Exception e){
      System.out.println("エラーです");
    }finally{
      fw.close();
    }
  }
}