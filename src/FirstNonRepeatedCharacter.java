import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        String string = input.chars().mapToObj(s -> Character.toUpperCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() >= 1)
                .map(x -> x.getKey()).findAny().get().toString();
        System.out.println(string);

    }
}
