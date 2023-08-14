
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(
            "q0",
            Set.of("q2", "q4"),
            Map.of("q0", Map.of('a', "q1", 'c', "q2"),
                   "q1", Map.of('b', "q3", 'c', "q1"),
                   "q2", Map.of('c', "q4"),
                   "q3", Map.of('b', "q4"),
                   "q4", Map.of())
        );

        System.out.println(avtomat.kam(""));
        System.out.println(avtomat.kam("a"));
        System.out.println(avtomat.kam("c"));
        System.out.println(avtomat.kam("cc"));
        System.out.println(avtomat.kam("ab"));
        System.out.println(avtomat.kam("abb"));
        System.out.println(avtomat.kam("accb"));
        System.out.println(avtomat.kam("acccbb"));
        System.out.println(avtomat.kam("accccccccccc"));
        System.out.println(avtomat.kam("b"));
        System.out.println(avtomat.kam("acbbbbbb"));
    }
}
