
public class Test06 {

    public static void main(String[] args) {
        int m = 31;

        int[][] p0 = {
            {13, 29, 12},
            {3, 21, 7},
            {2, 12, 1},
            {11, 4, 1},
            {26, 13, 4},
            {25, 13, 1},
            {10, 17, 1},
            {30, 14, 1},
            {0, 9, 1},
            {1, 6, 1},
            {12, 15, 1},
        };
        System.out.println(Druga.najGlobina(m, p0));

        int[][] p1 = {
            {3, 22, 22},
            {0, 6, 1},
            {1, 29, 2},
            {26, 7, 1},
            {27, 22, 4},
            {25, 15, 1},
        };
        System.out.println(Druga.najGlobina(m, p1));

        int[][] p2 = {
            {14, 1, 2},
            {5, 4, 2},
            {16, 14, 1},
            {29, 15, 1},
            {0, 9, 2},
            {12, 3, 1},
            {3, 30, 1},
            {7, 12, 2},
            {24, 27, 1},
            {23, 16, 1},
            {4, 2, 1},
            {27, 9, 1},
            {20, 20, 2},
            {9, 13, 2},
            {30, 19, 1},
            {25, 14, 2},
            {17, 7, 1},
            {19, 23, 1},
            {18, 7, 1},
            {22, 2, 1},
            {13, 9, 1},
            {28, 25, 1},
            {11, 4, 1},
            {2, 22, 1},
        };
        System.out.println(Druga.najGlobina(m, p2));

        int[][] p3 = {
            {4, 17, 10},
            {2, 25, 2},
            {21, 19, 9},
            {19, 3, 2},
            {15, 30, 2},
            {14, 24, 1},
            {0, 14, 1},
            {1, 2, 1},
            {30, 8, 1},
            {18, 12, 1},
            {17, 9, 1},
        };
        System.out.println(Druga.najGlobina(m, p3));

        int[][] p4 = {
            {4, 6, 5},
            {24, 13, 3},
            {27, 30, 3},
            {9, 20, 1},
            {13, 25, 6},
            {0, 16, 3},
            {21, 19, 1},
            {19, 12, 1},
            {3, 2, 1},
            {10, 16, 2},
            {23, 30, 1},
            {30, 10, 1},
            {12, 28, 1},
            {20, 5, 1},
            {22, 5, 1},
        };
        System.out.println(Druga.najGlobina(m, p4));
    }
}
