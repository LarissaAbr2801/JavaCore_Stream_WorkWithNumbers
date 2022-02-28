import java.util.*;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Object> stream = intList.stream()
                .filter(number -> number > 0 && number % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .map(number -> number + ", ");
        stream.forEach(System.out::print);
    }
}
