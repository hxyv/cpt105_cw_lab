
import java.time.*;
/**
 *
 * @author ntuzx
 */
public class LocalDateTest {
    public static void main(String[] agrs){
        
        LocalDate d1=LocalDate.now();
        System.out.println(d1);
        LocalDateTime d2=d1.atTime(11,12);
        System.out.println(d2);
        LocalDate d3=d1.plusDays(12);
        System.out.println(d3);

    }    
}
