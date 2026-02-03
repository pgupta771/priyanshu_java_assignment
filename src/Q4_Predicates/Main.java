package Q4_Predicates;
import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(-5,1-4,3,2,-9,7);

        Predicate<Integer> isPositive = n->n>0;
        Predicate<Integer> isEven = n-> n%2==0;

        numbers.stream()
                .filter(isPositive.and(isEven))
                .forEach(System.out::println);
    }
}
