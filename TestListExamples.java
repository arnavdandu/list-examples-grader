import static org.junit.Assert.*;
import org.junit.*;

public class EvenLengthChecker implements StringChecker {
  boolean checkString(String s) {
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
    assertEquals(ListExamplesCorrect.filter(list, ec), ListExamples.filter(list, ec));
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
    list2 = list.clone();
    assertEquals(ListExamplesCorrect.merge(list, list2), ListExamples.merge(list, list2));
  }
}
