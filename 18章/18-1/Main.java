import java.io.*;

public class Main{
  public static void main(String[] args) throws Exception{
    FileReader fr = new FileReader("date.txt");
    int input = fr.reed();
    while (input != -1){
      System.out.println((char)input);
      input = fr.read();
    }
    fr.close();
  }
}