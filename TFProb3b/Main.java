package CS401MPPSolutions.TFProb3b;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Alice","Bob","Charlie","Dan","Eve","Fred","George");
        Example instance =new Example();
        names.forEach(instance::printUpperCase);
    }
}
