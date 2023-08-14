
import java.util.*;

public class Test01 {

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

        System.out.println(avtomat.jeSprejemno("q0"));
        System.out.println(avtomat.jeSprejemno("q1"));
        System.out.println(avtomat.jeSprejemno("q2"));
        System.out.println(avtomat.jeSprejemno("q3"));
        System.out.println(avtomat.jeSprejemno("q4"));
    }
}
