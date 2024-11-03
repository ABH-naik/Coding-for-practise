import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingAscendingDescending {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(50, 10, 20, 15);
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
