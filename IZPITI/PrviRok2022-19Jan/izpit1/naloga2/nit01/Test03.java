
import java.util.*;

public class Test03 {

    private static final boolean T = true;
    private static final boolean F = false;

    private static final boolean[][] MATRIKA1 = {
        {F, T, F, F, F, F, F},
        {F, F, F, F, F, F, F},
        {F, F, F, F, F, F, F},
    };

    private static final boolean[][] MATRIKA2 = {
        {F, F, F, F, F, F, F},
        {F, F, F, F, F, T, F},
        {F, F, F, F, F, F, F},
    };

    private static final boolean[][] MATRIKA3 = {
        {F, F, F, F, F, T, F},
        {F, F, F, F, F, F, F},
        {F, F, F, F, T, F, F},
    };

    public static void main(String[] args) {
        System.out.println(Druga.potZoge(1, MATRIKA1, 1));
        System.out.println(Druga.potZoge(1, MATRIKA2, 1));
        System.out.println(Druga.potZoge(1, MATRIKA3, 1));
    }
}
