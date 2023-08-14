import java.util.*;
public class VozniRed {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt(); // h1 number
        int m1 = sc.nextInt(); // minutes1 number
        int h2 = sc.nextInt(); // h2 number
        int m2 = sc.nextInt(); // minutes2 number
        int i = sc.nextInt(); // interval
        int minute1 = 60*h1 + m1;
        int minute2 = 60*h2 + m2;

        System.out.printf("%02d:%02d"+'\n',h1,m1);

        int razlikaMinut = minute2 - minute1;
        int steviloVozenj = Math.round(razlikaMinut/i);
        int totalMinut = minute1;

        while (steviloVozenj > 0) {
            razlikaMinut = steviloVozenj*i;
            totalMinut = totalMinut+i;
            int ure = totalMinut/60;
            int minute = totalMinut % 60;
            System.out.printf("%02d:%02d"+'\n',ure,minute);
            steviloVozenj--;
        sc.close();

        }
    }
}

// tj.exe VozniRed.java testi rezultati -times -threads 10 -t 1000ms 