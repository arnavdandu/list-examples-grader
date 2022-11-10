import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class EvenLengthChecker implements StringChecker {
  public  boolean checkString(String s) {
    return s.length()%2==0;
  }
}

public class TestListExamples {
  @Test
  public void testFilter() {
    List<String> list = new ArrayList<>();
    StringChecker elc = new EvenLengthChecker();
    list.add("");
    list.add("a");
    list.add("ab");
    list.add("abc");
    list.add("abcd");
    assertEquals(ListExamplesCorrect.filter(list, elc), ListExamples.filter(list, elc));
  }

  @Test
  public void testMerge_duplicate() {
    List<String> list = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    list.add("");
    list.add("a");
    list.add("ab");
    list.add("abc");
    list.add("abcd");
    assertEquals(ListExamplesCorrect.merge(list, list), ListExamples.merge(list, list));
  }

}
