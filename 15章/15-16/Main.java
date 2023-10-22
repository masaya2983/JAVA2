import java.time.*;
import java.time.format.*;

public class Main{
  public static void main (String[] args){
    
    DateTimeFormatter fmt=DateTimeFormatter.ofpattern("yyyy/MM/dd");
    LoclDate ldate = LocalDate.parse("2020/09/22, fmt");
    
    
    LocalDate ldatep = ldate.plusDays(1000);
    String str = ldatep.format(fmt);
    System.out.println("1000日後は" + str);
    
    
    LocalDate now = LocalDate.now();
    if (now.isAfter(Ldatep)){
      System.out.println("1000日後は過去日付です");
    }
  }
}