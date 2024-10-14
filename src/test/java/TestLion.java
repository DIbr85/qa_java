import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;


import java.util.List;

@RunWith(Parameterized.class)
public class TestLion {
    private Lion lion;
    private Feline feline;
    private String sex;
    private boolean hasMale;

    @Parameterized.Parameters
    public static Object [][] data() {
        return new Object [][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    public TestLion(String sex, boolean hasMale) {
        this.sex = sex;
        this.hasMale = hasMale;
    }

    @Before
    public void setUp() throws Exception {
        feline = Mockito.mock(Feline.class);
        lion =  new Lion(sex, feline);
    }
    @Test
    public void testIsMale() {
        boolean expected = hasMale;
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expected);
        List<String> actual = lion.getFood();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetKittens() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        int actual = lion.getKittens();
        Assert.assertEquals(expected, actual);
    }


}
