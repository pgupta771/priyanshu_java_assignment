package Q3_UserStreams;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args){
        List<User> users = Arrays.asList(
                new User("pri", 21),
                new User("charu",16),
                new User("jon", 22)
        );

        List<String> result = users.stream()
                .filter(u->u.age>=18)
                .map(u->u.name.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
