import org.junit.*;
import static org.junit.Assert.*;

   public class HangmanTest {
     @Test
     public boolean isHangmanTest( int year) {
       return year % 4 == 0;
     }
   }
