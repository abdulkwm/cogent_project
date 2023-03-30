package java8new_Features.built_in_functionalInterface;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> c =(x) -> System.out.println(x.toLowerCase());
        c.accept("COGENT");
    }
}
