package CS401MPPSolutions.TFProb1;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.forEach(str ->System.out.println(str.toUpperCase()));
        System.out.println(list);
    }
}
