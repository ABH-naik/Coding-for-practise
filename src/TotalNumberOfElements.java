import java.util.Arrays;
import java.util.List;

public class TotalNumberOfElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 12, 32, 45);
        long count = list.stream().count();
        System.out.println(count);
    }
}
