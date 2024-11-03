import java.util.Arrays;
import java.util.List;

public class Java8EvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 24, 25, 26, 27, 28);
        list.stream().filter(n->n%2==0).forEach(System.out::println);
        int count = list.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(count);

    }
}
