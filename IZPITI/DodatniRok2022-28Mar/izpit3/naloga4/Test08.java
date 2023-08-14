
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        Cetrta.Avtomat avtomat = Cetrta.Avtomat.zaBesedo("java");
        for (String beseda: List.of("java", "jav", "ja", "j", "", "javaa", "ava", "va", "a")) {
            String stanje = null;
            try {
                stanje = avtomat.kam(beseda);
            } catch (RuntimeException ex) {}
            System.out.println(stanje != null && avtomat.jeSprejemno(stanje));
        }
    }
}
