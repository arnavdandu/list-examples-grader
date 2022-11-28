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
  @Test(timeout = 100)
  public void testFilter_mirroredList() { 
    List<String> list = new ArrayList<>();
    StringChecker elc = new EvenLengthChecker();
    list.add("");
    list.add("a");
    list.add("ab");
    list.add("aba");
    list.add("ab");
    list.add("a");
    list.add("");
    assertEquals(ListExamplesCorrect.filter(list, elc), ListExamples.filter(list, elc));
  }

  @Test(timeout = 100)
  public void testFilter_notMirrored() {
    List<String> list = new ArrayList<>();
    StringChecker elc = new EvenLengthChecker();
    list.add("");
    list.add("a");
    list.add("ab");
    list.add("abc");
    list.add("abcd");
    assertEquals(ListExamplesCorrect.filter(list, elc), ListExamples.filter(list, elc));
  }

  @Test(timeout = 100)
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

  @Test(timeout = 100)
  public void testMerge_list2Shorter() {
    List<String> list = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    list.add("");
    list.add("a");
    list.add("ab");
    list.add("abc");
    list.add("abcd");
    list2.add("bc");
    list2.add("A");
    list2.add("zxc");
    assertEquals(ListExamplesCorrect.merge(list, list2), ListExamples.merge(list, list2));
  }

  @Test(timeout = 100)
  public void testMerge_list1Shorter() {
    List<String> list = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    list2.add("");
    list2.add("a");
    list2.add("ab");
    list2.add("abc");
    list2.add("abcd");
    list.add("bc");
    list.add("A");
    list.add("zxc");
    assertEquals(ListExamplesCorrect.merge(list, list2), ListExamples.merge(list, list2));
  }

  @Test(timeout = 100)
  public void testMerge_sameSizeLists() {
    List<String> list = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    list2.add("");
    list2.add("a");
    list2.add("ab");
    list2.add("abc");
    list2.add("abcd");
    list.add("bc");
    list.add("A");
    list.add("zxc");
    list.add("ZZ");
    list.add("gfcfds");
    assertEquals(ListExamplesCorrect.merge(list, list2), ListExamples.merge(list, list2));
  }
}
