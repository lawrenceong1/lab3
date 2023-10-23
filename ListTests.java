import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ListTests {
	


    @Test
    public void testFilter3() {
        StringCheck sc = new StringCheck();
        List<String> testList = new ArrayList<>();
        testList.add("a");
        testList.add("b");
        testList.add("c");
        testList.add("d");
        assertEquals("a, b, c, d", ListExamples.filter(testList, sc));
    }
}
