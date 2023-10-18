public class Main {
  public static void main(String[] args){
    String s = "abc,def:ghi";
    String[] words = s.replaceAll("[beh]","X");
      Sytem.out.println(w); //aXc,dXf:gXi
  }
}