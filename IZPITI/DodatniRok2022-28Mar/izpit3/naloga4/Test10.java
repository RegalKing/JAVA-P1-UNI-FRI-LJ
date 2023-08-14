
import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        Cetrta.Avtomat avtomat = Cetrta.Avtomat.zaBesedo("ShVCWnXqDmFdNYxT");

        List<String> besede = List.of(
            "",
            "S",
            "Sh",
            "ShV",
            "ShVC",
            "ShVCW",
            "ShVCWn",
            "ShVCWnX",
            "ShVCWnXq",
            "ShVCWnXqD",
            "ShVCWnXqDm",
            "ShVCWnXqDmF",
            "ShVCWnXqDmFd",
            "ShVCWnXqDmFdN",
            "ShVCWnXqDmFdNY",
            "ShVCWnXqDmFdNYx",
            "ShVCWnXqDmFdNYxT",
            "hVCWnXqDmFdNYxT",
            "VCWnXqDmFdNYxT",
            "CWnXqDmFdNYxT",
            "WnXqDmFdNYxT",
            "nXqDmFdNYxT",
            "XqDmFdNYxT",
            "qDmFdNYxT",
            "DmFdNYxT",
            "mFdNYxT",
            "FdNYxT",
            "dNYxT",
            "NYxT",
            "YxT",
            "xT",
            "T",
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
