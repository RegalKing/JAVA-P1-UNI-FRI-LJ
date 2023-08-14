import java.util.*;
            public class SahovskiPopoldnevi{
                public static Random RNG;   
                public static void main (String[] args){
                    Scanner scan = new Scanner(System.in);
                    int seed = scan.nextInt();
                    int oddsForA = scan.nextInt();
                    int oddsForB = scan.nextInt();
                    int maxRounds = scan.nextInt();
                    int maxWins = scan.nextInt();
                    int days = scan.nextInt();
                    RNG = new Random();
                    RNG.setSeed(seed);
                    for (int i=1;i<=days;i++){
                        System.out.printf("%d"+". dan: ",i);
                        simulirajLegendarnoBitko(oddsForA, oddsForB, maxRounds, maxWins);
                    }
                }
                public static void simulirajLegendarnoBitko(int oddsForA,int oddsForB, int maxRounds, int maxWins){
                    int zmagA=0;
                    int zmagB=0;
                    int steviloRund=0;
                    while (zmagA<maxWins && zmagB<maxWins && steviloRund<maxRounds){
                        int trenutnoStevilo=RNG.nextInt(100);
                        if (trenutnoStevilo<oddsForA){
                            System.out.printf("A");
                            zmagA++;
                        }
                        else if (trenutnoStevilo>=oddsForA && trenutnoStevilo<(oddsForA+oddsForB)){
                            System.out.printf("B");
                            zmagB++;
                        }
                        else{
                            System.out.printf("r");
                        }

                        steviloRund++;
                    }
                    System.out.printf(" ("+steviloRund+")"+'\n');
                }
            }
