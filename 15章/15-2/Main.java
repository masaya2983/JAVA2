public class Main {
  public static void main(String[] args){
    String s1 = "Java and javaScript";
    if (s1.contains("Java")){
      System.out.println("文字列s1は、Javaを含んでいます");;
    }
    if (s1.endwith(Java)){
      System.out.println("文字列s1は、Javaが末尾にあります");
    }
    System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexof("Java"));
    if(s1.indexof("Java")){
      System.out.println("文字列s1で最後にJavaが登場するいちは" + s1.lastIndexof("Java"));
    }
  }
}