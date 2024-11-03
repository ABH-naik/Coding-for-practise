import java.util.Arrays;
import java.util.List;

public class Maximum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 12, 13, 14, 15);
        list.stream().max(Integer::compareTo).ifPresent(System.out::println);
    }
}
