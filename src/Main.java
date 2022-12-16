import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
        double v = list.stream().mapToInt(Integer::intValue).average().orElse(0);
        int g = (int) v;
        System.out.println(g);
        Map<Integer,Long> s = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        s.forEach((x,y) -> System.out.println(x + " : " +y));

    }
}