
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        Cetrta.Avtomat avtomat = Cetrta.Avtomat.zaBesedo("oJBlkqbVTyAuE");

        List<String> besede = List.of(
            "",
            "o",
            "oJ",
            "oJB",
            "oJBl",
            "oJBlk",
            "oJBlkq",
            "oJBlkqb",
            "oJBlkqbV",
            "oJBlkqbVT",
            "oJBlkqbVTy",
            "oJBlkqbVTyA",
            "oJBlkqbVTyAu",
            "oJBlkqbVTyAuE",
            "JBlkqbVTyAuE",
            "BlkqbVTyAuE",
            "lkqbVTyAuE",
            "kqbVTyAuE",
            "qbVTyAuE",
            "bVTyAuE",
            "VTyAuE",
            "TyAuE",
            "yAuE",
            "AuE",
            "uE",
            "E",
            "A",
            "B",
            "C",
            "D",
            "E",
            "F",
            "G",
            "H",
            "I",
            "J",
            "K",
            "L",
            "M",
            "N",
            "O",
            "P",
            "Q",
            "R",
            "S",
            "T",
            "U",
            "V",
            "W",
            "X",
            "Y",
            "Z",
            "a",
            "b",
            "c",
            "d",
            "e",
            "f",
            "g",
            "h",
            "i",
            "j",
            "k",
            "l",
            "m",
            "n",
            "o",
            "p",
            "q",
            "r",
            "s",
            "t",
            "u",
            "v",
            "w",
            "x",
            "y",
            "z"
        );

        for (String beseda: besede) {
            String stanje = null;
            try {
                stanje = avtomat.kam(beseda);
            } catch (RuntimeException ex) {}
            System.out.println(stanje != null && avtomat.jeSprejemno(stanje));
        }
    }
}
