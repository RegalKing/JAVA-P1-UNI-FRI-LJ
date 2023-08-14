
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        String zacetno = "q9";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q1");
        sprejemna.add("q4");
        sprejemna.add("q5");
        sprejemna.add("q6");
        sprejemna.add("q7");

        Map<String, Map<Character, String>> prehodi = new HashMap<>();
        prehodi.put("q0", new HashMap<>());
        prehodi.put("q1", new HashMap<>());
        prehodi.put("q2", new HashMap<>());
        prehodi.put("q3", new HashMap<>());
        prehodi.put("q4", new HashMap<>());
        prehodi.put("q5", new HashMap<>());
        prehodi.put("q6", new HashMap<>());
        prehodi.put("q7", new HashMap<>());
        prehodi.put("q8", new HashMap<>());
        prehodi.put("q9", new HashMap<>());
        prehodi.get("q0").put('a', "q9");
        prehodi.get("q1").put('b', "q4");
        prehodi.get("q1").put('c', "q2");
        prehodi.get("q2").put('c', "q6");
        prehodi.get("q2").put('d', "q2");
        prehodi.get("q3").put('c', "q0");
        prehodi.get("q4").put('b', "q2");
        prehodi.get("q5").put('a', "q3");
        prehodi.get("q5").put('b', "q2");
        prehodi.get("q6").put('b', "q7");
        prehodi.get("q7").put('a', "q5");
        prehodi.get("q8").put('b', "q0");
        prehodi.get("q8").put('c', "q1");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.jeSprejemno("q0"));
        System.out.println(avtomat.jeSprejemno("q1"));
        System.out.println(avtomat.jeSprejemno("q2"));
        System.out.println(avtomat.jeSprejemno("q3"));
        System.out.println(avtomat.jeSprejemno("q4"));
        System.out.println(avtomat.jeSprejemno("q5"));
        System.out.println(avtomat.jeSprejemno("q6"));
        System.out.println(avtomat.jeSprejemno("q7"));
        System.out.println(avtomat.jeSprejemno("q8"));
        System.out.println(avtomat.jeSprejemno("q9"));
    }
}
