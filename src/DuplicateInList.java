import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 20, 30, 40, 50);
        Set<Integer> set=new HashSet<>();
        list.stream().filter(n-> !set.add(n)).forEach(System.out::println);

    }
}
