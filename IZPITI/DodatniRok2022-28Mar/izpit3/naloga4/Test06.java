
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        String zacetno = "q0";

        Set<String> sprejemna = new HashSet<>();
        sprejemna.add("q1");
        sprejemna.add("q2");
        sprejemna.add("q4");
        sprejemna.add("q5");
        sprejemna.add("q9");
        sprejemna.add("q11");
        sprejemna.add("q14");
        sprejemna.add("q18");

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
        prehodi.put("q12", new HashMap<>());
        prehodi.put("q13", new HashMap<>());
        prehodi.put("q14", new HashMap<>());
        prehodi.put("q15", new HashMap<>());
        prehodi.put("q16", new HashMap<>());
        prehodi.put("q17", new HashMap<>());
        prehodi.put("q18", new HashMap<>());
        prehodi.get("q0").put('b', "q6");
        prehodi.get("q0").put('c', "q17");
        prehodi.get("q0").put('d', "q7");
        prehodi.get("q1").put('a', "q4");
        prehodi.get("q1").put('c', "q9");
        prehodi.get("q2").put('c', "q9");
        prehodi.get("q2").put('d', "q15");
        prehodi.get("q3").put('a', "q10");
        prehodi.get("q3").put('c', "q11");
        prehodi.get("q3").put('d', "q17");
        prehodi.get("q4").put('a', "q6");
        prehodi.get("q4").put('b', "q8");
        prehodi.get("q5").put('a', "q8");
        prehodi.get("q5").put('b', "q4");
        prehodi.get("q5").put('c', "q9");
        prehodi.get("q5").put('d', "q1");
        prehodi.get("q6").put('a', "q17");
        prehodi.get("q6").put('b', "q2");
        prehodi.get("q6").put('c', "q6");
        prehodi.get("q7").put('a', "q5");
        prehodi.get("q7").put('b', "q11");
        prehodi.get("q8").put('a', "q10");
        prehodi.get("q8").put('d', "q13");
        prehodi.get("q9").put('a', "q9");
        prehodi.get("q9").put('b', "q13");
        prehodi.get("q9").put('c', "q12");
        prehodi.get("q9").put('d', "q7");
        prehodi.get("q10").put('a', "q4");
        prehodi.get("q10").put('c', "q7");
        prehodi.get("q10").put('d', "q13");
        prehodi.get("q11").put('b', "q6");
        prehodi.get("q12").put('a', "q3");
        prehodi.get("q12").put('b', "q14");
        prehodi.get("q13").put('c', "q15");
        prehodi.get("q14").put('c', "q1");
        prehodi.get("q14").put('d', "q14");
        prehodi.get("q15").put('c', "q1");
        prehodi.get("q16").put('a', "q17");
        prehodi.get("q16").put('b', "q7");
        prehodi.get("q16").put('c', "q8");
        prehodi.get("q17").put('a', "q13");
        prehodi.get("q17").put('b', "q17");
        prehodi.get("q18").put('a', "q14");
        prehodi.get("q18").put('c', "q0");
        prehodi.get("q18").put('d', "q11");

        Cetrta.Avtomat avtomat = new Cetrta.Avtomat(zacetno, sprejemna, prehodi);

        System.out.println(avtomat.kam("cacccabcc"));
        System.out.println(avtomat.kam("dababdcab"));
        System.out.println(avtomat.kam("dacaaab"));
        System.out.println(avtomat.kam("bcbcb"));
        System.out.println(avtomat.kam("dabbdccaa"));
        System.out.println(avtomat.kam("bcbdcaa"));
        System.out.println(avtomat.kam("dadcaa"));
        System.out.println(avtomat.kam("dadcaaaaa"));
        System.out.println(avtomat.kam("dbbbccaad"));
        System.out.println(avtomat.kam("dacadaaad"));
        System.out.println(avtomat.kam("daccbccad"));
        System.out.println(avtomat.kam("bccaacccd"));
        System.out.println(avtomat.kam("daccaaaaa"));
    }
}
