import java.util.Arrays;
import java.util.List;

public class NumberstartsWith1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 12, 25, 35);
        list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
    }
}
