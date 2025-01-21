import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class SkaiciuokleTest {

        @Test
        public void testSudetis() {
            Skaiciuokle skaiciuokle = new Skaiciuokle(10, 5);
            assertEquals(15, skaiciuokle.sudetis());
        }

        @Test
        public void testAtimtis() {
            Skaiciuokle skaiciuokle = new Skaiciuokle(10, 5);
            assertEquals(5, skaiciuokle.atimtis());
        }

        @Test
        public void testDaugyba() {
            Skaiciuokle skaiciuokle = new Skaiciuokle(10, 5);
            assertEquals(50, skaiciuokle.daugyba());
        }

        @Test
        public void testDalyba() {
            Skaiciuokle skaiciuokle = new Skaiciuokle(10, 5);
            assertEquals(2, skaiciuokle.dalyba());
        }

        @Test
        public void testDalybaByZero() {
            Skaiciuokle skaiciuokle = new Skaiciuokle(10, 0);
            assertThrows(ArithmeticException.class, skaiciuokle::dalyba);
        }
    }
}
