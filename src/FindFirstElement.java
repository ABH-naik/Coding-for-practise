import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        list.stream().findFirst().ifPresent(System.out::println);
    }
}
