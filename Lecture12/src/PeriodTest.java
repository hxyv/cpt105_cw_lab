
import java.time.*;
import java.time.temporal.*;
/**
 *
 * @author ntuzx
 */
public class PeriodTest {
    public static void main(String[] agrs){
        
        LocalDate d1=LocalDate.now();
        LocalDate d2=LocalDate.now().plusMonths(6).plusDays(50);
        Period p1=Period.between(d1, d2);
        Period p2=p1.plusDays(20).plusMonths(2);
        System.out.println("Year: "+p1.getYears());
        System.out.println("Month: "+p1.getMonths());
        System.out.println("Day: "+p1.getDays());
        System.out.println(ChronoUnit.DAYS.between(d1, d2));
    }    
}
