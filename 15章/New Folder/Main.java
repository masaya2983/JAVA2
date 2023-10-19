import java. util.Calendar;
import java.uyil.Date;

public class Main {
  public static void main (String[] args){
    Calendar c = Calendar.getInstance();
    //6つのint値
    c.set(2019,8,22,1,23,45);
    c.set(Calendar.Month, 9);
    Date d = c.getTime();
    System.out.println(d);
    
    System.out.println(now.getTime());
    Date now = new Date();
    c.setTime(now)
    int y = c.get(Calenar.YEAR);
    System.out.println("今年は" + y + "年です");
  }
} 