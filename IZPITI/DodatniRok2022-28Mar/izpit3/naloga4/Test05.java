
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        String zacetno = "q6";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q1");
        sprejemna.add("q2");
        sprejemna.add("q3");
        sprejemna.add("q4");
        sprejemna.add("q5");
        sprejemna.add("q6");
        sprejemna.add("q7");
        sprejemna.add("q8");
        sprejemna.add("q10");
        sprejemna.add("q11");

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
        prehodi.put("q10", new HashMap<>());
        prehodi.put("q11", new HashMap<>());
        prehodi.get("q0").put('c', "q3");
        prehodi.get("q1").put('a', "q9");
        prehodi.get("q2").put('c', "q6");
        prehodi.get("q4").put('b', "q0");
        prehodi.get("q5").put('d', "q7");
        prehodi.get("q6").put('b', "q1");
        prehodi.get("q7").put('c', "q4");
        prehodi.get("q8").put('d', "q5");
        prehodi.get("q9").put('b', "q11");
        prehodi.get("q10").put('b', "q8");
        prehodi.get("q11").put('b', "q10");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.kam("babbbddcbc"));
        System.out.println(avtomat.kam("b"));
        System.out.println(avtomat.kam("babbbddcb"));
        System.out.println(avtomat.kam("ba"));
        System.out.println(avtomat.kam("babbbdd"));
        System.out.println(avtomat.kam(""));
        System.out.println(avtomat.kam("babb"));
        System.out.println(avtomat.kam("babbbd"));
        System.out.println(avtomat.kam("babbbddc"));
        System.out.println(avtomat.kam("babbb"));
        System.out.println(avtomat.kam("bab"));
    }
}
