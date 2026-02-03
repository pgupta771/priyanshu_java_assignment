package Q5_OptionalUser;

import java.util.Optional;

public class Main{
    static Optional<User> findUser(String id){
        return Optional.of(new User("Priyanshu",true));
    }
    public static  void main(String[]args){

        findUser("105")
                .filter(u->u.active)
                .map(u->u.name)
                .ifPresentOrElse(
                        System.out::println,
                        ()->System.out.println("User not found")
                );
    }
}

