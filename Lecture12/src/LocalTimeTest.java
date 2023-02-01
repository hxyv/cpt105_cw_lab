import java.time.*;
/**
 *
 * @author ntuzx
 */
public class LocalTimeTest {
    public static void main(String[] agrs){
        
        LocalTime t1=LocalTime.now();
        System.out.println(t1);
        LocalDateTime ld1=t1.atDate(LocalDate.now());
        System.out.println(ld1);
        LocalTime t2=t1.plusHours(12);
        System.out.println(t2);

    }    
}
