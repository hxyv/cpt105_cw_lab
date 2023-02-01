
import java.time.*;
import java.time.temporal.*;
/**
 *
 * @author ntuzx
 */
public class DurationTest {
    public static void main(String[] agrs){
        
        LocalTime lt1=LocalTime.now();
        LocalTime lt2=lt1.plusMinutes(6).plusHours(1);
        Duration d1=Duration.between(lt1, lt2);
        Duration d2=d1.plusMinutes(30);
 
        System.out.println("Second: "+d2.get(ChronoUnit.SECONDS));
        
    }    
}
