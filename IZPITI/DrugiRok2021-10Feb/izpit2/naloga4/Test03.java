
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>();
        seznam.add("mravlinjek");
        seznam.add("nedebel");
        seznam.add("neovedeno");
        seznam.add("krionika");
        seznam.add("antiherojski");
        seznam.add("janjece");
        seznam.add("odvinkati");
        seznam.add("depozitnik");
        seznam.add("malodenaren");
        seznam.add("parnopernast");
        seznam.add("eksorcizirati");
        seznam.add("toksikoinfekcija");
        seznam.add("juh");
        seznam.add("kalvinizem");
        seznam.add("biciklistka");
        seznam.add("hajkanje");
        seznam.add("prediranje");
        seznam.add("lobranca");
        seznam.add("slivkati");
        seznam.add("dromeljski");
        seznam.add("obedovalec");
        seznam.add("brezpriden");
        seznam.add("transfuzija");
        seznam.add("vozlatost");
        seznam.add("adjektivizirati");
        seznam.add("netekmovalec");
        seznam.add("neslutenje");
        seznam.add("specius");
        seznam.add("sprepeljavati");
        seznam.add("stativ");
        seznam.add("bedak");
        seznam.add("tilec");
        seznam.add("osemgeneracijski");
        seznam.add("furibunden");
        seznam.add("predzavzeti");
        seznam.add("elektrospodbuda");
        seznam.add("svojeglav");
        seznam.add("toplina");
        seznam.add("kvazilinearen");
        seznam.add("spakovje");
        seznam.add("zakonspiriranost");
        seznam.add("neoprijemljivost");

        int dolzina = seznam.size();

        // bodimo malce zlobni ...
        Iterator<String> it = Cetrta.razmnozevalnik(seznam, 9);
        for (int i = 0;  i < dolzina;  i++) {
            seznam.set(i, seznam.get(i) + "_neoplemenjen");
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
