import java.text.*;
import java.time.*;
import java.time.format.*;
/**
 *
 * @author ntuzx
 */
public class LocalDateTimeTest {
    public static void main(String[] agrs){
        
        LocalDateTime dt1=LocalDateTime.now();
        System.out.println(dt1);
        LocalDateTime dt2=dt1.minusDays(30);
        System.out.println(dt2);
        DateTimeFormatter dtFormat1 = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");       
        System.out.println(dt2.format(dtFormat1));

    }    
}
