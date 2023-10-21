import java.time.*;

public class Main {
  public static void main (String[] args) {
    //Instantの生成
    Instant il = Instant.now();
    
    //Instantとlong値との相互変換
    Instant i2 = Instant.ofEpochMilili(1600705425827L);
    long l = i2.toEpochMili();
    
    //
    ZonedDateTime z1 = ZoneDateTime.now();
    ZonedDateTime z2 = ZoneDateTime.of(2020,1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));
    
    
    Instant i3 = z2.toInstant();
    ZoneDateTime z3 = i3.atZone(ZoneID.of("Europe/London"));
    
    
    System.out.println("東京:" + z2.getYear() +z3.getMonth() + z3.getDayMonth());
    if(z2.isEqual(z3)){
      System.out.println("これらは同じ瞬間を指しています");
    }
    
  }
}