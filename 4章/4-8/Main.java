public class Main{
  public static void main(String[]args){
    int[] scores = {20, 30, 40, 50, 80};
    int sum = scores[1] + scores[2] + scores[3] + scores[4] +scores[5];
    int avg = sum/scores.length;
    System.outprintln("合計点:" + sum);
    System.out.println("平均点:" + avg);
  }
}