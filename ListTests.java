import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListTests{
    @Test
    public void testFilter(){
        List<String> lst1 = Arrays.asList("abc", "bce", "bcd", "app", "bee", "foo");
        StringsCheck sc = new StringsCheck("bc");
        List<String> exp = Arrays.asList("abc", "bce", "bcd");
        assertEquals(exp, ListExamples.filter(lst1, sc));
    }

    @Test
    public void testMerge(){
        List<String> ls1 =Arrays.asList("a", "d", "e");
        List<String> ls2 = Arrays.asList("b", "c", "f");
        List<String> ls3 = Arrays.asList("a", "b", "c", "d", "e", "f");
        assertEquals(ls3, ListExamples.merge(ls1, ls2));
    }
}

