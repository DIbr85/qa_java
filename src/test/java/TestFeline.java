import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TestFeline {
    private Feline feline;
    @Before
    public void setUp() {
        feline = new Feline();
    }
    @Test
    public void eatMeatTest() throws Exception{
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getFamilyTest() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getKittensTestWithCount() {
        int expected = 7;
        int actual = feline.getKittens(expected);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getKittensTestDefaultCount() {
        int expected = 1;
        int actual = feline.getKittens();
        Assert.assertEquals(expected, actual);
    }
}
