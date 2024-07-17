package CS401MPPSolutions.TFProb2;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
      Stream<String> myStream=  list.stream()
                .filter((String s) -> s.length() >5);
    }
}
