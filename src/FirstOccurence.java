import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstOccurence {
    public static void main(String[] args) {
        String name="JAVA TECHIE";
        Map<String, Long> collect = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
