import java.util.stream.*;
class DoubleColonOp {
    public static void main(String[] args) {
        Stream<String> stream
                = Stream.of("Hello", "My",
                "name", "is",
                "Samad",
                "Abdul");

        stream.forEach(System.out::println);
    }
}

