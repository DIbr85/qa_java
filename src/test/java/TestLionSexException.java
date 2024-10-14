import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class TestLionSexException {
    @Mock
    Feline feline;

    @Test
    public void testLionSexException() {
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion("Пол", feline));
        String expected = "Используйте допустимые значения пола животного - самец или самка";
        String actual = exception.getMessage();
        Assert.assertEquals(expected, actual);
    }

}
